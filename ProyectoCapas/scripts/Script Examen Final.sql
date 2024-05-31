DROP DATABASE examenfinal;
CREATE DATABASE examenfinal;
USE examenfinal;

CREATE TABLE IF NOT EXISTS usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(60) NOT NULL,
  password VARCHAR(25)NOT NULL,
  PRIMARY KEY (id_usuario) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE pacientes
(
  id_paciente VARCHAR(5),
  nombre_paciente VARCHAR(45),
  apellido_paciente VARCHAR(45),
  genero_paciente VARCHAR(60),
  direccion_paciente VARCHAR(100),
  telefono_paciente VARCHAR(80),
  estatus_paciente VARCHAR(1),
  PRIMARY KEY (id_paciente)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS aplicacion (
	aplid int NOT NULL AUTO_INCREMENT,
    aplnombre VARCHAR(50),
    aplestatus VARCHAR(50),
    PRIMARY KEY (aplid)
)  ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- Creacion de la Bitacora de Seguridad
CREATE TABLE IF NOT EXISTS bitacora (
	bitid int auto_increment PRIMARY KEY,
    bitfecha datetime NULL,
    bitaccion VARCHAR (10) NOT NULL,
    bitip VARCHAR(25) NOT NULL,
    bitnombrepc VARCHAR(50) NOT NULL,
    usuid INT NOT NULL,
    aplid INT NOT NULL,
    FOREIGN KEY (aplid) references aplicacion (aplid),
    FOREIGN KEY (usuid) references usuario (id_usuario)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;