create database mts;
use  mts;




create table mts.ACCOUNTS(
 num varchar(12), 
 balance double,
 holderName varchar(30),
 acc_type varchar(30),
 acc_status varchar(30)
 );
 
 insert into mts.ACCOUNTS values('1',1000.00,'Akarsh','SAVING','ACTIVE');
 insert into mts.ACCOUNTS values('2',1000.00,'Anushka','SAVING','ACTIVE');