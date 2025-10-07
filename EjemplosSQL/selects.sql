--------------------------------------------------------
-- Tabla de trabajo
--------------------------------------------------------
CREATE TABLE empleados (
  id           NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  nombre       VARCHAR2(50)      NOT NULL,
  departamento VARCHAR2(30)      NOT NULL,
  salario      NUMBER(8,2)       NOT NULL CHECK (salario >= 0),
  fecha_alta   DATE              DEFAULT SYSDATE,
  comision     NUMBER(5,2), -- porcentaje (%), puede ser NULL
  activo       CHAR(1)           DEFAULT 'S' CHECK (activo IN ('S','N'))
);

--------------------------------------------------------
-- 18 INSERTs de ejemplo
--------------------------------------------------------
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Ana López',       'Ventas',    32000, DATE '2023-01-10', 10, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Luis Pérez',      'IT',        41000, DATE '2022-11-05', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('María Gómez',     'Finanzas',  38000, DATE '2024-03-12', 5,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Carlos Ruiz',     'Ventas',    29000, DATE '2023-07-01', 12, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Elena Martín',    'RRHH',      30000, DATE '2022-02-20', NULL, 'N');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Jorge Díaz',      'IT',        45000, DATE '2024-01-15', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Sofía Navarro',   'Marketing', 34000, DATE '2023-05-22', 3,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Pablo Romero',    'Finanzas',  52000, DATE '2021-09-30', 7,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Nuria Santos',    'IT',        37000, DATE '2024-06-18', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Iván Torres',     'Ventas',    31000, DATE '2024-02-05', 8,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Raúl Ortega',     'Marketing', 28000, DATE '2023-09-11', NULL, 'N');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Lucía Vázquez',   'RRHH',      33000, DATE '2021-12-01', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Andrés Molina',   'IT',        48000, DATE '2020-08-14', 2,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Marta Castillo',  'Ventas',    36000, DATE '2022-10-03', 6,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Eva Herrera',     'Finanzas',  40000, DATE '2024-07-09', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Tomás Gil',       'IT',        39000, DATE '2023-03-28', NULL, 'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Patricia León',   'Marketing', 35000, DATE '2022-05-17', 4,  'S');
INSERT INTO empleados (nombre, departamento, salario, fecha_alta, comision, activo) VALUES
('Hugo Cabrera',    'Ventas',    27000, DATE '2024-08-21', 15, 'N');

COMMIT;

--------------------------------------------------------
--- SELECT BÁSICO
-- Todos los campos, todas las filas
--------------------------------------------------------
SELECT * FROM empleados;

-- Selección de columnas específicas + alias de salida
SELECT
  id AS "ID",
  nombre AS "Empleado",
  departamento AS "Depto",
  salario AS "Salario (€)"
FROM empleados;

--------------------------------------------------------
--WHERE: una condición
--------------------------------------------------------
-- Salarios mayores de 35.000
SELECT id, nombre, salario
FROM empleados
WHERE salario > 35000;

-- Empleados activos
SELECT id, nombre, activo
FROM empleados
WHERE activo = 'S';

-- Fecha de alta a partir de 2024-01-01
SELECT id, nombre, fecha_alta
FROM empleados
WHERE fecha_alta >= DATE '2024-01-01';


--------------------------------------------------------
-- WHERE: varias condiciones (AND/OR)
--------------------------------------------------------
-- IT con salario >= 40k y activos
SELECT nombre, departamento, salario, activo
FROM empleados
WHERE departamento = 'IT'
  AND salario >= 40000
  AND activo = 'S';

-- Ventas con comisión >= 10% o NO activos (paréntesis!)
SELECT nombre, departamento, comision, activo
FROM empleados
WHERE (departamento = 'Ventas' AND comision >= 10)
   OR activo = 'N';

-- Departamentos concretos
SELECT nombre, departamento
FROM empleados
WHERE departamento IN ('IT', 'Finanzas', 'Ventas');

-- Salario entre 30k y 40k (ambos inclusive)
SELECT nombre, salario
FROM empleados
WHERE salario BETWEEN 30000 AND 40000;

-- Búsqueda por patrón (LIKE) – nombres que empiezan por 'M'
SELECT nombre
FROM empleados
WHERE nombre LIKE 'M%';

-- Filtrar nulos: empleados sin comisión
SELECT nombre, comision
FROM empleados
WHERE comision IS NULL;

--------------------------------------------------------
--Ordenaciones: ORDER BY (múltiples claves y NULLS LAST)
--------------------------------------------------------
-- Orden alfabético ascendente
SELECT nombre, departamento, salario
FROM empleados
ORDER BY nombre ASC;

-- Por departamento asc, y dentro por salario desc
SELECT nombre, departamento, salario
FROM empleados
ORDER BY departamento ASC, salario DESC;

-- Ordenar por comisión descendente, colocando los NULL al final
SELECT nombre, comision
FROM empleados
ORDER BY comision DESC NULLS LAST;

--------------------------------------------------------
--“LIMIT” en Oracle: FETCH FIRST / OFFSET
--------------------------------------------------------
-- Las 5 primeras filas por salario desc
SELECT nombre, salario
FROM empleados
ORDER BY salario DESC
FETCH FIRST 5 ROWS ONLY;

-- Paginación: saltar 5 y traer las siguientes 5
SELECT nombre, salario
FROM empleados
ORDER BY salario DESC
OFFSET 5 ROWS
FETCH NEXT 5 ROWS ONLY;

--------------------------------------------------------
-- Alias, expresiones y funciones
--------------------------------------------------------
-- Alias con espacios y cálculo de salario total estimado con comisión
-- (si comision es %, aplicamos NVL para tratar NULL como 0)
SELECT
  nombre AS "Empleado",
  salario AS "Salario Base",
  NVL(comision, 0) AS "% Comisión",
  ROUND(salario * (1 + NVL(comision,0)/100), 2) AS "Salario + Comisión (€)"
FROM empleados;

-- Funciones de cadena y fecha
SELECT
  UPPER(nombre)           AS "NOMBRE MAYÚSCULAS",
  INITCAP(departamento)   AS "Depto Title Case",
  TO_CHAR(fecha_alta, 'YYYY-MM-DD') AS "Alta"
FROM empleados;

--------------------------------------------------------
-- Agregación + GROUP BY
--------------------------------------------------------
-- Métricas globales
SELECT
  COUNT(*)       AS total_empleados,
  ROUND(AVG(salario),2) AS media_salario,
  MIN(salario)   AS min_salario,
  MAX(salario)   AS max_salario,
  SUM(NVL(comision,0)) AS suma_porcentajes_comision
FROM empleados;

-- Métricas por departamento
SELECT
  departamento,
  COUNT(*)                  AS n_empleados,
  ROUND(AVG(salario), 2)    AS salario_medio,
  SUM(salario)              AS masa_salarial
FROM empleados
GROUP BY departamento
ORDER BY salario_medio DESC;

--------------------------------------------------------
-- Filtrar grupos (HAVING): solo depts con salario medio > 37.000
--------------------------------------------------------
SELECT
  departamento,
  ROUND(AVG(salario), 2) AS salario_medio
FROM empleados
GROUP BY departamento
HAVING AVG(salario) > 37000
ORDER BY salario_medio DESC;


--------------------------------------------------------
-- Combinando filtros, agregación y orden
--------------------------------------------------------
-- Solo empleados activos desde 2023 en adelante, agrupados por depto
SELECT
  departamento AS "Depto",
  COUNT(*)     AS "Activos",
  ROUND(AVG(salario),2) AS "Salario medio"
FROM empleados
WHERE activo = 'S'
  AND fecha_alta >= DATE '2023-01-01'
GROUP BY departamento
ORDER BY "Salario medio" DESC;


--------------------------------------------------------
-- Clasificar salarios
--------------------------------------------------------
SELECT
  nombre,
  salario,
  CASE
    WHEN salario >= 45000 THEN 'Alto'
    WHEN salario >= 35000 THEN 'Medio'
    ELSE 'Bajo'
  END AS tramo_salarial
FROM empleados
ORDER BY salario DESC;
