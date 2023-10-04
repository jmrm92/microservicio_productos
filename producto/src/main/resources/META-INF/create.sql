CREATE TABLE pedidosdb.productos (
	codigo_producto INT auto_increment NOT NULL,
	producto varchar(100) NULL,
	precio DOUBLE NULL,
	stock INT NULL,
	CONSTRAINT productos_pk PRIMARY KEY (codigo_producto)
)

INSERT INTO pedidosdb.productos
(codigo_producto, producto, precio, stock)
VALUES(1, 'Galletas', 5.0, 10);
INSERT INTO pedidosdb.productos
(codigo_producto, producto, precio, stock)
VALUES(2, 'Leche', 2.0, 50);
INSERT INTO pedidosdb.productos
(codigo_producto, producto, precio, stock)
VALUES(3, 'Cereales', 3.0, 30);
INSERT INTO pedidosdb.productos
(codigo_producto, producto, precio, stock)
VALUES(4, 'Pan', 4.0, 25);