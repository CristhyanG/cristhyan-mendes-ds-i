create database projetojava;
use projetojava;
create table usuario(
id bigint(10) auto_increment,
nome varchar(255),
cpf varchar(11),
email varchar(255),
telefone varchar(13),
primary key(id)
);

select *from usuario;