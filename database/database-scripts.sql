DROP DATABASE IF EXISTS productos;
CREATE DATABASE IF NOT EXISTS productos;
USE productos;


CREATE TABLE productos (
    codigo      INT  AUTO_INCREMENT  NOT NULL, 
    nombre      VARCHAR(20)  UNIQUE  NOT NULL,
    precio      DOUBLE		     NOT NULL,
    inventario  INT                  NOT NULL,    
    PRIMARY KEY (codigo)
);


INSERT INTO productos (nombre, precio, inventario)
VALUES
("Manzanas", 8000.0, 65), 
("Limones", 2300.0, 15),
("Granadilla", 2500.0,  38),
("Arandanos", 9300.0, 55), 
("Tomates", 2100.0, 42),
("Fresas", 4100.0, 3),
("Helado", 4500.0, 41),
("Galletas", 500.0, 8), 
("Chocolates", 3500.0, 806),
("Jamon", 15000.0, 10);