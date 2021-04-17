/*Criar um schema*/
CREATE DATABASE agenda;

/*Entrar em um schema*/
use agenda;

/*Criando tabela contato*/
create table contato(
	id serial primary key,
    nome varchar(50) not null,
    fone varchar(16),
    email varchar(200) not null,
    observacao tinytext
);

/*Descreve a tabela*/
describe contato;

/*Inserir dados na tabela*/
insert into contato (nome, fone, email, observacao)
values ('Gabriel','42 9 9999-9999','gabriel@email.com','programador'),
('Alicio','42 0 0000-0000','alicio@email.com','dev. java'),
('Lorde','42 8 8888-8888','lorde@email.com','pro player');

/*Deleta dados da tabela*/
delete from contato;

/*Truncate deleta os dados da tabela e zera o ID*/
truncate contato;

/*Adicionar uma coluna de data com o valor de data padrao(datetime)*/
alter table contato 
add column data_cadastro datetime default now();
--___________________________________________________
-- CRUD
-- CREAT
insert into contato (nome, fone, email, observacao)
values ('','','','');

-- READ
select * from contato;

-- UPDATE
update contato
set nome = ''
where id = '';

-- DELETE
delete from contato
where id = '';
