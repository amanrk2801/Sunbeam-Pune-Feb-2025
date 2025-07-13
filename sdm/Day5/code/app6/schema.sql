create table user(
    id integer primary key auto_increment, 
    name varchar(100),
    email varchar(50),
    password varchar(100)
);

create table product(
    id integer primary key auto_increment, 
    title varchar(100),
    description varchar(5000),
    price float
);


insert into user (name, email, password) values ('user1','user1@test.com','test');
insert into user (name, email, password) values ('user2','user2@test.com','test');
insert into user (name, email, password) values ('user3','user3@test.com','test');

insert into product(title, description, price) values ('product1', 'description of product 1', 100);
insert into product(title, description, price) values ('product2', 'description of product 2', 200);
insert into product(title, description, price) values ('product3', 'description of product 3', 300);
insert into product(title, description, price) values ('product4', 'description of product 4', 400);