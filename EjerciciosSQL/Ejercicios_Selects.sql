-- TECNOLOGIA
INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, iva)
VALUES ('Smartphone 128GB', 'TECNOLOGIA', 499.00, 30, TO_DATE('05/09/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-003', 21);

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, iva)
VALUES ('Tablet 10"', 'TECNOLOGIA', 199.99, 0, TO_DATE('20/07/2025','DD/MM/YYYY'), 'INACTIVO', 'SKU-T-004', 21);

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Monitor 27" 2K', 'TECNOLOGIA', 279.00, 7, SYSDATE, 'ACTIVO', 'SKU-T-005');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Teclado mecánico', 'TECNOLOGIA', 89.90, 15, TO_DATE('12/08/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-006');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Cámara deportiva 4K', 'TECNOLOGIA', 149.00, 10, TO_DATE('28/05/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-007');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Auriculares gaming', 'TECNOLOGIA', 69.00, 25, TO_DATE('03/10/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-008');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Smartwatch', 'TECNOLOGIA', 139.00, 14, TO_DATE('18/06/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-009');

-- HOGAR
INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Robot aspirador', 'HOGAR', 229.00, 5, TO_DATE('03/06/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-H-003');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Batidora de vaso', 'HOGAR', 45.00, 18, SYSDATE, 'ACTIVO', 'SKU-H-004');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Funda de almohada', 'HOGAR', 9.99, 0, TO_DATE('11/07/2025','DD/MM/YYYY'), 'INACTIVO', 'SKU-H-005');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, iva)
VALUES ('Silla ergonómica', 'HOGAR', 159.00, 8, TO_DATE('22/04/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-H-006', 21);

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Cafetera espresso', 'HOGAR', 129.00, 6, TO_DATE('09/09/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-H-007');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Freidora de aire', 'HOGAR', 99.00, 0, TO_DATE('30/08/2025','DD/MM/YYYY'), 'INACTIVO', 'SKU-H-008');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Lámpara LED escritorio', 'HOGAR', 22.90, 40, TO_DATE('05/05/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-H-009');

-- DEPORTE
INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Mancuernas 5kg', 'DEPORTE', 35.00, 20, TO_DATE('14/07/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-002');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Esterilla de yoga', 'DEPORTE', 19.95, 0, TO_DATE('21/06/2025','DD/MM/YYYY'), 'INACTIVO', 'SKU-D-003');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, iva)
VALUES ('Zapatillas running', 'DEPORTE', 79.00, 12, TO_DATE('02/09/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-004', 21);

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Bicicleta de spinning', 'DEPORTE', 499.00, 3, TO_DATE('17/03/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-005');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Balón de baloncesto', 'DEPORTE', 24.50, 50, TO_DATE('12/10/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-006');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Cinta de correr', 'DEPORTE', 699.00, 2, TO_DATE('08/01/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-007');

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, iva)
VALUES ('Comba de velocidad', 'DEPORTE', 12.99, 35, TO_DATE('25/08/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-008', 21);

INSERT INTO TB_PRODUCTOS_PROFE (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Rodillo foam', 'DEPORTE', 16.50, 9, TO_DATE('19/05/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-D-009');


-- SINTAXIS SELECT
--SELECT [DISTINCT] 
       --expr [, expr ...]
--FROM   fuente [, fuente ...]                -- tabla, vista, subconsulta, JOIN
--[WHERE  condición]
--[GROUP BY expr [, expr ...]]
--[HAVING condición_sobre_agregados]
--[ORDER BY expr [ASC|DESC] [NULLS FIRST|LAST] [, ...]]
--[OFFSET n ROWS]                              -- límite/paginación (12c+)
--[FETCH {FIRST|NEXT} n ROWS ONLY];            -- límite/paginación (12c+)


--1) Listado básico

--Enunciado: Muestra todas las columnas de todos los TB_PRODUCTOS_PROFE.
--Solución:


SELECT * FROM TB_PRODUCTOS_PROFE;


---

--2) Proyección y ordenación

--Enunciado: Lista `nombre`, `categoria` y `precio`, ordenado alfabéticamente por `nombre`.
--Solución:


SELECT nombre, categoria, precio
  FROM TB_PRODUCTOS_PROFE
 ORDER BY nombre ASC;


---

--3) Filtro simple

--Enunciado: Muestra los TB_PRODUCTOS_PROFE de la categoría TECNOLOGIA con `precio` entre 100 y 300 euros.
--Solución:


SELECT id, nombre, precio
  FROM TB_PRODUCTOS_PROFE
 WHERE categoria = 'TECNOLOGIA'
   AND precio BETWEEN 100 AND 300
 ORDER BY precio;




--4) Nulos, defaults y condiciones

--Enunciado: Obtén los TB_PRODUCTOS_PROFE con stock = 0 (rotación nula) y muestra `id`, `nombre`, `estado`.
--Solución:


SELECT id, nombre, estado
  FROM TB_PRODUCTOS_PROFE
 WHERE stock = 0
 ORDER BY nombre;


---

--5) Funciones sobre fechas

--Enunciado: Muestra los TB_PRODUCTOS_PROFE dados de alta en septiembre de 2025.
--Solución:


SELECT id, nombre, fecha_alta
  FROM TB_PRODUCTOS_PROFE
 WHERE fecha_alta >= DATE '2025-09-01'
   AND fecha_alta <  DATE '2025-10-01'
 ORDER BY fecha_alta, nombre;


---

--6) Agregación por categoría

--Enunciado: Muestra cuántos TB_PRODUCTOS_PROFE hay por `categoria`.
--Solución:


SELECT categoria, COUNT(*) AS total
  FROM TB_PRODUCTOS_PROFE
 GROUP BY categoria
 ORDER BY total DESC;


---

--7) Métricas de negocio

--Enunciado: Para cada `categoria`, calcula precio medio, precio máx y unidades totales en stock.
--Solución:


SELECT categoria,
       ROUND(AVG(precio), 2)  AS precio_medio,
       MAX(precio)            AS precio_max,
       SUM(stock)             AS unidades_en_stock
  FROM TB_PRODUCTOS_PROFE
 GROUP BY categoria
 ORDER BY categoria;


---

--8) Top-N

--Enunciado: Devuelve los 5 TB_PRODUCTOS_PROFE más caros (id, nombre, categoria, precio).
--Solución:


SELECT id, nombre, categoria, precio
  FROM TB_PRODUCTOS_PROFE
 ORDER BY precio DESC
 FETCH FIRST 5 ROWS ONLY;


---

--9) Cálculo de PVP con IVA

--Enunciado: Muestra `nombre`, `precio` y el PVP (precio con IVA), redondeado a 2 decimales.
--Solución:


SELECT nombre,
       precio,
       ROUND(precio * (1 + (NVL(iva,21) / 100)), 2) AS pvp_con_iva
  FROM TB_PRODUCTOS_PROFE
 ORDER BY pvp_con_iva DESC;


---

--10) Enunciado: Encuentra TB_PRODUCTOS_PROFE cuyo nombre contenga la palabra “cafe”.
--Solución:

SELECT id, nombre
  FROM TB_PRODUCTOS_PROFE
 WHERE LOWER(nombre) LIKE '%cafe%';


--11) Media de precio por categoría (solo TECNOLOGIA y HOGAR, activos)

--Enunciado: Para las categorías TECNOLOGIA y HOGAR con `estado = 'ACTIVO'`, muestra precio medio y nº de TB_PRODUCTOS_PROFE. Solo devuelve categorías cuya media sea > 100€. Ordena por media desc.
--Solución:
SELECT categoria,
       ROUND(AVG(precio),2) AS precio_medio,
       COUNT(*)             AS num_TB_PRODUCTOS_PROFE
FROM TB_PRODUCTOS_PROFE
WHERE categoria IN ('TECNOLOGIA','HOGAR')
  AND estado = 'ACTIVO'
GROUP BY categoria
HAVING AVG(precio) > 100
ORDER BY precio_medio DESC;


---

--12) Stock por mes para (ago, sep, oct) 2025 en categorías seleccionadas
--Solución:
--Enunciado: Para HOGAR y DEPORTE, en los meses agosto, septiembre, octubre de 2025, agrupa por mes y categoría, muestra stock total. Devuelve solo grupos con stock ≥ 20. Ordena por mes asc, stock desc.

SELECT TRUNC(fecha_alta, 'MM') AS mes,
       categoria,
       SUM(stock) AS stock_total
FROM TB_PRODUCTOS_PROFE
WHERE categoria IN ('HOGAR','DEPORTE')
  AND EXTRACT(YEAR  FROM fecha_alta) = 2025
  AND EXTRACT(MONTH FROM fecha_alta) IN (8,9,10)
GROUP BY TRUNC(fecha_alta, 'MM'), categoria
HAVING SUM(stock) >= 20
ORDER BY mes ASC, stock_total DESC;


---

--13) IVA y categoría con masa crítica

--Enunciado: Considera solo TB_PRODUCTOS_PROFE con IVA en (21,10) y categoría en (TECNOLOGIA, HOGAR, DEPORTE). Agrupa por IVA y categoría y muestra nº de TB_PRODUCTOS_PROFE y precio máximo. Devuelve solo grupos con al menos 3 TB_PRODUCTOS_PROFE. Ordena por IVA asc, nº desc.
--Solución:

SELECT iva,
       categoria,
       COUNT(*)      AS num_TB_PRODUCTOS_PROFE,
       MAX(precio)   AS precio_max
FROM TB_PRODUCTOS_PROFE
WHERE iva IN (21,10)
  AND categoria IN ('TECNOLOGIA','HOGAR','DEPORTE')
GROUP BY iva, categoria
HAVING COUNT(*) >= 3
ORDER BY iva ASC, num_TB_PRODUCTOS_PROFE DESC;


---

--14) Catálogo filtrado por nombres concretos

--Enunciado: Toma solo los TB_PRODUCTOS_PROFE cuyo nombre esté en la lista
--`('Auriculares BT','Auriculares gaming','Cafetera espresso','Freidora de aire','Smartwatch')`.
--Agrupa por categoría y estado y muestra precio medio y stock total. Devuelve grupos con precio medio > 50. Ordena por precio medio desc.
--Solución:

SELECT categoria,
       estado,
       ROUND(AVG(precio),2) AS precio_medio,
       SUM(stock)           AS stock_total
FROM TB_PRODUCTOS_PROFE
WHERE nombre IN ('Auriculares BT','Auriculares gaming',
                 'Cafetera espresso','Freidora de aire','Smartwatch')
GROUP BY categoria, estado
HAVING AVG(precio) > 50
ORDER BY precio_medio DESC;


---

--15) Control de “rotación cero” dentro de categorías

--Enunciado: Sobre HOGAR y DEPORTE, agrupa por categoría y estado y calcula cuántos tienen stock = 0 y el precio medio. Devuelve solo grupos con al menos 1 producto con stock 0 y precio medio ≥ 20. Ordena por categoría, estado.
--Solución:

SELECT categoria,
       estado,
       SUM(CASE WHEN stock = 0 THEN 1 ELSE 0 END) AS sin_stock,
       ROUND(AVG(precio),2)                        AS precio_medio
FROM TB_PRODUCTOS_PROFE
WHERE categoria IN ('HOGAR','DEPORTE')
GROUP BY categoria, estado
HAVING SUM(CASE WHEN stock = 0 THEN 1 ELSE 0 END) >= 1
   AND AVG(precio) >= 20
ORDER BY categoria ASC, estado ASC;

