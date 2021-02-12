create database ecommerce;
use ecommerce;


create table tb_produtos(
id bigint auto_increment,
nome_cliente varchar (255),
idade_cliente int,
nome_do_produto varchar (255),
valor float,
marca varchar (255),
primary key (id));

select * from tb_produtos;

insert into tb_produtos (nome_cliente, idade_cliente, nome_do_produto, valor, marca) values 
("Maria", 23, "Iphone 6s", 1400, "Apple"), ("Gustavo", 27, "Galaxy S7", 2000, "Samsung"), ("Juliana", 32, "Airpods", 345, "Apple"),
("Heitor", 18, "Cabo USB", 137, "Samsung"), ("Paula", 28, "Fonte Notebok", 250, "Asus");


insert into tb_produtos (nome_cliente, idade_cliente, nome_do_produto, valor, marca) values 
("Rafael", 38, "Iphone X", 3500, "Apple"), ("Diego", 27, "Fone bluetoth", 178, "Samsung");

select nome_do_produto,valor from tb_produtos where valor>500;
select nome_do_produto,valor, marca from tb_produtos where valor<500;

 