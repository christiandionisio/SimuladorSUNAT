CREATE DATABASE SIMULADOR_SUNAT;

USE SIMULADOR_SUNAT;

CREATE TABLE FACTURA (
    id_factura VARCHAR(50) NOT NULL PRIMARY KEY,
    ruc_empresa VARCHAR(50) NOT NULL,
    nombre_facturador VARCHAR(100),
    direccion_facturaador VARCHAR(100),
    telefono_facturador VARCHAR(100),
    dni_facturador VARCHAR(100),
    fecha_emision VARCHAR(50)
);

CREATE TABLE DETALLE_FACTURA(
    id_detalle INT PRIMARY KEY AUTO_INCREMENT,
    id_factura VARCHAR(50),
    nombre_producto VARCHAR(100),
    cantidad INT,
    precio FLOAT,
    tipo_moneda VARCHAR(20)
);

ALTER TABLE DETALLE_FACTURA
ADD FOREIGN KEY (id_factura) REFERENCES FACTURA(id_factura);