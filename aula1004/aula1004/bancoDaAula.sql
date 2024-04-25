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
alter table  usuario 
add sexo enum('F', 'M'),
add anoNascimento int(4),
add nacionalidade varchar(40),
add endereco varchar(400); 


select *from usuario;

