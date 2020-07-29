DROP DATABASE IF EXISTS estacionamento;
CREATE DATABASE estacionamento;
USE estacionamento;

CREATE TABLE carro(
placa CHAR(7) NOT NULL,
cor VARCHAR(15),
descricao VARCHAR(100),
PRIMARY KEY (placa)
);

CREATE TABLE tbusuario(
idUsuario INT AUTO_INCREMENT,
nomeUsu VARCHAR(15),
senhaUsu VARCHAR(15),
PRIMARY KEY (idUsuario)
);

INSERT INTO tbUsuario (nomeUsu, senhaUsu) VALUES ("admin", "admin");
