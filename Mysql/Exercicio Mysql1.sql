
create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values("bovino", true);
insert tb_categoria (descricao, ativo) values("Suino", true);
insert tb_categoria (descricao, ativo) values("Aves", true);
insert tb_categoria (descricao, ativo) values("Marinhos", true);
insert tb_categoria (descricao, ativo) values("Silvestres", true);

select * from tb_categoria;

create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Linguiça", 29, 3,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Acém", 32, 3,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon", 20, 3,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Salmão", 60, 3,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Ganso", 77, 3,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Peito de frango", 25, 3,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Alcatra", 45, 3,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Asa", 22, 3,3);

select * from tb_produtos;
select nome, preco from tb_produtos where preco>50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%c%";
select  nome, preco, qtProduto, tb_categoria.descricao, tb_categoria.ativo from tb_produtos inner join tb_categoria on 
tb_categoria.id = tb_produtos.categoria_id;