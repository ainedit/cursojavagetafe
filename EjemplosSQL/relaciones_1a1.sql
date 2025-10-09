-- Patrones 1:1:
--   A) PK COMPARTIDA (PK de la hija = FK a la padre) -> 1:1 estricta.
--   B) FK UNIQUE (FK en hija marcada UNIQUE) -> a lo sumo 1 hija por padre.
-- ------------------------------------------------------------

-- ============================================================
-- 1) PATRÓN A: PK COMPARTIDA (CITIZEN - DNI)
-- ============================================================

-- Tabla padre
CREATE TABLE CITIZEN (
  CITIZEN_ID  NUMBER GENERATED ALWAYS AS IDENTITY,,
  FULL_NAME   VARCHAR2(100) NOT NULL,
  BIRTH_DATE  DATE         NOT NULL,
  CONSTRAINT PK_CITIZEN PRIMARY KEY (CITIZEN_ID)
);


-- Tabla hija: PK = FK a CITIZEN (1:1 ESTRICTA)
CREATE TABLE DNI (
  CITIZEN_ID  NUMBER GENERATED ALWAYS AS IDENTITY,
  DNI_NUMBER  CHAR(9)      NOT NULL,
  ISSUED_ON   DATE         NOT NULL,
  CONSTRAINT PK_DNI PRIMARY KEY (CITIZEN_ID),
  CONSTRAINT UQ_DNI_NUMBER UNIQUE (DNI_NUMBER),
  CONSTRAINT FK_DNI_CITIZEN FOREIGN KEY (CITIZEN_ID)
    REFERENCES CITIZEN (CITIZEN_ID)
    ON DELETE CASCADE
);

-- ============================================================
-- 2) PATRÓN B: FK UNIQUE (EMPLOYEE - LOCKER)
-- ============================================================

CREATE TABLE EMPLOYEE (
  EMPLOYEE_ID NUMBER GENERATED ALWAYS AS IDENTITY,,
  FULL_NAME   VARCHAR2(100) NOT NULL,
  HIRED_ON    DATE          NOT NULL,
  CONSTRAINT PK_EMPLOYEE PRIMARY KEY (EMPLOYEE_ID)
);

CREATE TABLE LOCKER (
  LOCKER_ID    NUMBER GENERATED ALWAYS AS IDENTITY,,
  CODE         VARCHAR2(20)  NOT NULL,
  EMPLOYEE_ID  NUMBER(10)    NULL, -- NULL = taquilla libre
  CONSTRAINT PK_LOCKER PRIMARY KEY (LOCKER_ID),
  CONSTRAINT UQ_LOCKER_CODE UNIQUE (CODE),
  CONSTRAINT UQ_LOCKER_EMP UNIQUE (EMPLOYEE_ID),
  CONSTRAINT FK_LOCKER_EMP FOREIGN KEY (EMPLOYEE_ID)
    REFERENCES EMPLOYEE (EMPLOYEE_ID)
    ON DELETE SET NULL
);

-- ============================================================
-- 3) INSERCIÓN DE DATOS
-- ============================================================

-- Ciudadanos
INSERT INTO CITIZEN (FULL_NAME, BIRTH_DATE) VALUES ('Ana Pérez',    TO_DATE('1990-03-12','YYYY-MM-DD'));
INSERT INTO CITIZEN (FULL_NAME, BIRTH_DATE) VALUES ('Carlos Gómez', TO_DATE('1985-11-02','YYYY-MM-DD'));
INSERT INTO CITIZEN (FULL_NAME, BIRTH_DATE) VALUES ('María López',  TO_DATE('2001-07-25','YYYY-MM-DD'));

-- DNI (solo dos ciudadanos lo tienen emitido: IDs 1 y 2)
INSERT INTO DNI (CITIZEN_ID, DNI_NUMBER, ISSUED_ON) VALUES (1, '12345678Z', TO_DATE('2010-05-10','YYYY-MM-DD'));
INSERT INTO DNI (CITIZEN_ID, DNI_NUMBER, ISSUED_ON) VALUES (2, '87654321X', TO_DATE('2004-09-21','YYYY-MM-DD'));
-- (María aún no tiene DNI)

-- Empleados
INSERT INTO EMPLOYEE (FULL_NAME, HIRED_ON) VALUES ('Lucía Martín',  TO_DATE('2022-01-10','YYYY-MM-DD'));
INSERT INTO EMPLOYEE (FULL_NAME, HIRED_ON) VALUES ('Diego Álvarez', TO_DATE('2023-05-03','YYYY-MM-DD'));
INSERT INTO EMPLOYEE (FULL_NAME, HIRED_ON) VALUES ('Sofía Ortega',  TO_DATE('2024-02-15','YYYY-MM-DD'));

-- Taquillas (una libre, dos asignadas)
INSERT INTO LOCKER (CODE, EMPLOYEE_ID) VALUES ('LK-001', 1);  -- asignada a Lucía
INSERT INTO LOCKER (CODE, EMPLOYEE_ID) VALUES ('LK-002', NULL); -- libre
INSERT INTO LOCKER (CODE, EMPLOYEE_ID) VALUES ('LK-003', 3);  -- asignada a Sofía


-- ============================================================
-- 4) CONSULTAS CON JOIN (Oracle)
-- ============================================================

-- 4.1 INNER JOIN: ciudadanos con DNI emitido
SELECT c.citizen_id, c.full_name, d.dni_number, d.issued_on
FROM   citizen c
       INNER JOIN dni d
           ON d.citizen_id = c.citizen_id
ORDER  BY c.citizen_id;

-- 4.2 LEFT OUTER JOIN: todos los ciudadanos, con su DNI si existe
SELECT c.citizen_id, c.full_name, d.dni_number, d.issued_on
FROM   citizen c
       LEFT OUTER JOIN dni d
           ON d.citizen_id = c.citizen_id
ORDER  BY c.citizen_id;

-- 4.3 RIGHT OUTER JOIN: todas las filas de la derecha (dni) y coincidentes de citizen
SELECT c.citizen_id, c.full_name, d.dni_number, d.issued_on
FROM   citizen c
       RIGHT OUTER JOIN dni d
           ON d.citizen_id = c.citizen_id
ORDER  BY d.citizen_id;

-- 4.4 FULL OUTER JOIN: todas las filas de ambos lados
SELECT COALESCE(c.citizen_id, d.citizen_id) AS key_id,
       c.full_name, d.dni_number, d.issued_on
FROM   citizen c
       FULL OUTER JOIN dni d
           ON d.citizen_id = c.citizen_id
ORDER  BY key_id;

-- 4.5 JOIN USING (cuando el nombre de la clave coincide)
SELECT c.full_name, d.dni_number
FROM   citizen c JOIN dni d USING (citizen_id)
ORDER  BY c.full_name;

-- 4.6 LEFT JOIN en patrón B: empleados con/sin taquilla
SELECT e.employee_id, e.full_name, l.code AS locker_code
FROM   employee e
       LEFT OUTER JOIN locker l
           ON l.employee_id = e.employee_id
ORDER  BY e.employee_id;

-- 4.7 RIGHT JOIN en patrón B: todas las taquillas (asignadas o libres)
SELECT l.locker_id, l.code AS locker_code, e.full_name AS assigned_to
FROM   employee e
       RIGHT OUTER JOIN locker l
           ON l.employee_id = e.employee_id
ORDER  BY l.locker_id;

-- 4.8 FULL OUTER JOIN en patrón B: todos los empleados y todas las taquillas
SELECT e.employee_id, e.full_name, l.locker_id, l.code AS locker_code
FROM   employee e
       FULL OUTER JOIN locker l
           ON l.employee_id = e.employee_id
ORDER  BY COALESCE(e.employee_id, l.locker_id);

-- 4.9 CROSS JOIN (producto cartesiano; usar con cuidado)
SELECT e.full_name, l.code
FROM   employee e
       CROSS JOIN locker l
ORDER  BY e.employee_id, l.locker_id;

-- 4.10 Anti-join (empleados SIN taquilla)
SELECT e.employee_id, e.full_name
FROM   employee e
       LEFT OUTER JOIN locker l
           ON l.employee_id = e.employee_id
WHERE  l.employee_id IS NULL
ORDER  BY e.employee_id;

-- 4.11 Taquillas LIBRES (sin empleado asignado)
SELECT l.locker_id, l.code
FROM   locker l
       LEFT OUTER JOIN employee e
           ON l.employee_id = e.employee_id
WHERE  e.employee_id IS NULL
ORDER  BY l.locker_id;
