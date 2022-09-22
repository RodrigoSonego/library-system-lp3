create database library_system;

use library_system;

create table user(
idUser int not null auto_increment,
login varchar(10) not null,
email varchar(10) not null,
`password` varchar(10) not null,
primary key(idUser)
);

create table book(
idBook int not null auto_increment,
FK_idUser int not null,
title varchar(10) not null,
`year` int(10) not null,
author varchar(10) not null,
`language` varchar(10) not null,
isbn varchar(10) not null,
pages int(6) not null,
primary key(idBook),
constraint FK_Book_User foreign key (FK_idUser) 
references user(idUser) on update cascade on delete cascade
);

create table article(
idArticle int not null auto_increment,
FK_idUser int not null,
title varchar(10) not null,
`year` int(10) not null,
author varchar(10) not null,
doi varchar(10) not null,
journal varchar(10) not null,
primary key(idArticle),
constraint FK_Article_User foreign key (FK_idUser) 
references user(idUser) on update cascade on delete cascade
);

drop database library_system;

insert into user(login, email, `password`) values ("uba123", "ainbb", "000");
insert into book(FK_idUser, title, `year`, author, `language`, isbn, pages) values (1, "macumba", 8972, "olokomeu", "macaques", "007", 80);
insert into article(FK_idUser, title, `year`, author, doi, journal) values (1, "macaco", 8502, "loro josé", "doojaan", "pimba");

select * from user;
select * from book;
select * from article;

select 


