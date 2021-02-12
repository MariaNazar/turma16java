create database registro_de_alunos;

use registro_de_alunos;

create table informacoes_alunos (
id bigint auto_increment,
nome_aluno varchar (255),
idade_aluno int,
media_nota float, 
status_aprovacao varchar (255),
turma int,
primary key (id));

select *from informacoes_alunos;

insert into informacoes_alunos(nome_aluno, idade_aluno, media_nota, status_aprovacao, turma) values 
("Maria", 23, 6.7, "reprovadx", 2),("Julio", 20, 7.2, "aprovadx", 3),("Allan", 22, 8.1, "aprovadx", 1),
("Juliana", 23, 4.3, "reprovadx", 3), ("Fabiana", 22, 9.4, "aprovadx", 2),("José", 20, 2.1, "reprovadx", 1), 
("Diego", 25, 9.7, "aprovadx", 2), ("Gustavo", 23, 7.1, "aprovadx", 1), ("Valeria", 23, 7.9, "aprovadx", 2),
("Helio", 22, 1.4, "reprovadx", 3);

select nome_aluno, media_nota from informacoes_alunos where media_nota <7;
select nome_aluno, media_nota from informacoes_alunos where media_nota >7;
