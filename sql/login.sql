drop database if exists login;
create database login;
use login;
create table users3(
	username varchar(255),
	password varchar(255)
	);
insert into users3 values("mike","123");
insert into users3 values("buchi","456");
insert into users3 values("tama","123");