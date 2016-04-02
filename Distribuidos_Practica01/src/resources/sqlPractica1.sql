-- ---
-- Globals
-- ---

DROP DATABASE IF EXISTS practica1;
CREATE DATABASE practica1;
USE practica1;

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'cliente'
-- 
-- ---
DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
  id_cliente INT(10) NOT NULL AUTO_INCREMENT,
  password CHAR(10) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apaterno VARCHAR(45) NOT NULL,
  amaterno VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  calle VARCHAR(45) NOT NULL,
  colonia VARCHAR(45) NOT NULL,
  numero INT(10) NOT NULL,
  PRIMARY KEY (id_cliente)
);

-- ---
-- Table 'cuenta'
-- 
-- ---
DROP TABLE IF EXISTS cuenta;
CREATE TABLE cuenta (
  id_cuenta BIGINT(20) NOT NULL,
  balance DOUBLE NOT NULL,
  id_cliente INT(10) NOT NULL,
  PRIMARY KEY (id_cuenta),
  KEY (id_cliente)
);

-- ---
-- Table 'operacion_cuenta'
-- 
-- ---
DROP TABLE IF EXISTS operacion_cuenta;
CREATE TABLE operacion_cuenta (
  id_operacion_cuenta BIGINT(20) NOT NULL,
  id_cuenta BIGINT(20) NOT NULL,
  fecha DATE NOT NULL,
  tipo_movimiento CHAR(1) NOT NULL,
  cantidad DOUBLE NOT NULL,
  PRIMARY KEY (id_operacion_cuenta),
  KEY (id_cuenta)
);

-- ---
-- Foreign Keys 
-- ---
ALTER TABLE cuenta ADD FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE operacion_cuenta ADD FOREIGN KEY (id_operacion_cuenta) REFERENCES cuenta (id_cuenta);

-- ---
-- Table Properties
-- ---
ALTER TABLE cliente ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE cuenta ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE operacion_cuenta ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---
-- INSERT INTO cliente (id_cliente,password,nombre,apaterno,amaterno,telefono,calle,colonia,numero) VALUES
-- ('','','','','','','','','');
-- INSERT INTO cuenta (id_cuenta,balance,id_cliente) VALUES
-- ('','','');
-- INSERT INTO operacion_cuenta (id_operacion_cuenta,id_cuenta,fecha,tipo_movimiento,cantidad) VALUES
-- ('','','','','');
