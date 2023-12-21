create database spring_cloud_learn;
commit ;
use spring_cloud_learn;
create table user
(
    id       int auto_increment
        primary key,
    username varchar(255) null,
    password varchar(255) null
);
commit ;
