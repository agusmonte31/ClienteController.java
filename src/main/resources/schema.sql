DROP TABLE CLIENTE IF EXISTS ;
CREATE TABLE CLIENTE (
dni INT not null,
nombre VARCHAR(200),
apellido VARCHAR(200),
fechaNacimiento DATE not null,
PRIMARY KEY (DNI)
)

//Tabla cliente
