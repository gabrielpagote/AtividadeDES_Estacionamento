DROP DATABASE IF EXISTS estacionamento;
CREATE DATABASE estacionamento;
USE estacionamento;

CREATE TABLE carro(
placa CHAR(7) NOT NULL,
cor VARCHAR(15),
descricao VARCHAR(100),
PRIMARY KEY (placa)
);

CREATE TABLE usuario(
idUsuario INT AUTO_INCREMENT,
usuarioAdmin VARCHAR(15),
senhaAdmin VARCHAR(15),
nomeUsuario VARCHAR(15),
senhaUsuario VARCHAR(15),
PRIMARY KEY (idUsuario)
);