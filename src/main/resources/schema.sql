
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
Cantidad int,
Precio int,
primary key(IdProducto)
);


DROP TABLE COMPROBANTES IF EXISTS;
CREATE TABLE COMPROBANTES (
IdComprobante int not null,
Fecha DATE,
Cantidad int not null,
PrecioNeto int,
Impuesto int,
PrecioTotal int not null,
DNI int not null,
primary key (IdComprobante)
);


