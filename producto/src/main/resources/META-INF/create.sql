CREATE TABLE pedidosdb.productos (
	codigo_producto INT auto_increment NOT NULL,
	producto varchar(100) NULL,
	precio DOUBLE NULL,
	stock INT NULL,
	CONSTRAINT productos_pk PRIMARY KEY (codigo_producto)
)