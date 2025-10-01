-- =========================================================
-- 1) Creación de la tabla PRODUCTOS
-- =========================================================
-- Notas:
-- - id autoincremental: IDENTITY (Oracle 12c+).
-- - "estado": Oracle no tiene ENUM; usamos VARCHAR2 + CHECK.
-- - "fecha_registro": para fecha y hora usamos TIMESTAMP (contiene milisegundos y zona horaria)
DROP TABLE productos;

CREATE TABLE productos (
  id              NUMBER GENERATED ALWAYS AS IDENTITY,
  nombre          VARCHAR2(100)   NOT NULL,
  descripcion     VARCHAR2(500)   NULL,
  marca			  VARCHAR2(50)    NOT NULL,
  precio          NUMBER(8,2)     NOT NULL,
  stock           NUMBER(10)      DEFAULT 0 NOT NULL,
  fecha_registro  TIMESTAMP       DEFAULT SYSTIMESTAMP NOT NULL,
  descuento       NUMBER(3)       NULL,
  estado          VARCHAR2(8)     DEFAULT 'activo' NOT NULL,
  -- Restricciones
  CONSTRAINT ck_productos_precio_nonneg    CHECK (precio >= 0),
  CONSTRAINT ck_productos_descuento_0_100  CHECK (descuento BETWEEN 0 AND 100),
  CONSTRAINT ck_productos_estado_enum      CHECK (estado IN ('activo','inactivo'))
  CONSTRAINT pk_usuarios PRIMARY KEY (id)   -- nombre explícito
);

--Alternativa crear la constraint después de la tabla
ALTER TABLE usuarios
  ADD CONSTRAINT pk_usuarios PRIMARY KEY (id);
  
  
-- =========================================================
-- 2a) Modificación: añadir columnas
-- =========================================================

ALTER TABLE productos ADD (categoria VARCHAR2(50) NOT NULL);

ALTER TABLE productos ADD (proveedor VARCHAR2(100));  -- NULL permitido por defecto

-- =========================================================
-- 2b) Modificar el tipo de datos de la columna descripcion
-- Cambiar el tipo de datos de descripcion de TEXT a VARCHAR(500) para limitar la longitud a 500 caracteres.
-- =========================================================

ALTER TABLE productos MODIFY (descripcion VARCHAR2(50));


-- =========================================================
-- 3) Eliminación de la tabla (cuando termines las pruebas)
-- =========================================================
DROP TABLE productos PURGE;
-- (PURGE evita que vaya a la papelera de reciclaje/RECYCLEBIN)

