CREATE DATABASE sample_app_db;

USE sample_app_db;

CREATE TABLE product(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(1000),
    price FLOAT,
    createdTimestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO product(title, description, price) VALUES
    ('product 1', 'this is nice product 1', 100),
    ('product 2', 'this is nice product 2', 200),
    ('product 3', 'this is nice product 3', 300),
    ('product 4', 'this is nice product 4', 400),
    ('product 5', 'this is nice product 5', 500),
    ('product 6', 'this is nice product 6', 600),
    ('product 7', 'this is nice product 7', 700),
    ('product 8', 'this is nice product 8', 800),
    ('product 9', 'this is nice product 9', 900),
    ('product 10', 'this is nice product 10', 1000);