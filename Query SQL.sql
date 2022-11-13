create database if not exists ExamFinal;
use  ExamFinal;
create table if not exists invent
(
	Id int primary key auto_increment not null,
    Fecha_Inc date null,
    Fecha_fin date null,
    Stock_Inc int null,
    Entradas int null,
    Salidas int null,
    Total int null
);

ALTER TABLE invent
ADD CONSTRAINT fk_invent
FOREIGN KEY (Id) REFERENCES invent(Id);

select * from invent;