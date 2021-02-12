create database servico_de_rh;

use servico_de_rh;

create table tb_funcionarios (
id bigint auto_increment, 
nome varchar(255) not null, 
salario float not null, 
idade int not null, 
funcao varchar(255) not null, 
valetransporte char not null,
primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, salario,idade,funcao,valetransporte)values("Maria",1200,23, "Dev jr.", "s"),
("Athos",5000, 26, "Dev jr.", "s"),("Raphael", 2500, 25, "Dev jr.", "n"), ("Anahy", 2750, 23, "Dev pleno", "s"), ("João", 3250, 29, "Tech lead", "n");


insert into tb_funcionarios (nome, salario,idade,funcao,valetransporte)values("Allan",2434,27, "Dev senior", "n");

select nome,salario from tb_funcionarios where salario<2000;
select nome,salario from tb_funcionarios where salario>2000;

insert into tb_funcionarios (nome,salario, idade,funcao, valetransporte)values("Mateus", 1789,30, "Dev jr.","s");

select nome,valetransporte from tb_funcionarios;


