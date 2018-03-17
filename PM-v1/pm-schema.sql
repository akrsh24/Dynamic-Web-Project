create database shop_db;
use shop_db;

create table shop_db.PRODUCTS(
	id int,
	name varchar(50),
	price double,
	make_date date,
	description varchar(256)
);