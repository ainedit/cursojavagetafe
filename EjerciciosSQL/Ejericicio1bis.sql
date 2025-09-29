-- Ejercicio 1 bis
-- =============================================
-- 1) Crear la tabla USUARIOS

-- - Se recomienda VARCHAR2 en lugar de VARCHAR.
-- - Autoincremento: usar IDENTITY (21c lo soporta).
-- - Para la fecha por defecto, SYSDATE toma la hora del servidor (habitual en este caso).

CREATE TABLE usuarios (
  id              NUMBER GENERATED ALWAYS AS IDENTITY    -- autoincrementable
                      PRIMARY KEY,                        -- clave primaria
  nombre          VARCHAR2(50)       NOT NULL,           -- no nulo
  email           VARCHAR2(100)      NOT NULL,           -- no nulo
  fecha_registro  DATE DEFAULT SYSDATE                    -- valor por defecto: fecha/hora actual
);

-- Añadimos la unicidad de email (puedes hacerlo inline en el CREATE; aquí lo dejo explícito)
ALTER TABLE usuarios
  ADD CONSTRAINT uq_usuarios_email UNIQUE (email);

-- 2) Modificar la tabla para añadir columna TELEFONO (nullable)
ALTER TABLE usuarios
  ADD telefono VARCHAR2(15);  -- al no indicar NOT NULL, permite nulos

-- 3) Cambiar el tipo de datos de NOMBRE a VARCHAR2(100)
--    (válido porque ampliamos tamaño; si hubiera datos, no rompe compatibilidad)
ALTER TABLE usuarios
  MODIFY nombre VARCHAR2(100);