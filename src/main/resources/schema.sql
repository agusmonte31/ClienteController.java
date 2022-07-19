
DROP TABLE CLIENTE IF EXISTS;
CREATE TABLE CLIENTE (
dni INT not null,
nombre VARCHAR(200),
apellido VARCHAR(200),
fechaNacimiento DATE not null,
PRIMARY KEY (DNI)
);
DROP TABLE PRODUCTOS IF EXISTS;
CREATE TABLE PRODUCTOS (
IdProducto INT not null,
Codigo VARCHAR(10)NOT NULL,
Cantidad INT,
Precio INT,
PRIMARY KEY(IdProducto)
);


DROP TABLE COMPROBANTES IF EXISTS;
CREATE TABLE COMPROBANTES (
IdComprobante INT not null,
fecha_comprobante DATE not null,
cantidad_comprobante INT not null,
precioneto_comprobante INT,
preciototal_comprobante INT not null,
PRIMARY KEY (IdComprobante)
);


