DROP DATABASE IF EXISTS dac_db;

CREATE DATABASE dac_db;
USE dac_db;

CREATE TABLE student(
    rollno INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    marks DECIMAL(7,2),
    mobile VARCHAR(10)
);

INSERT INTO student(name,marks,mobile) VALUES 
("Akash",40,"9836465739"),
("Prakash",50,"8794476956"),
("Ram",45,"9987573574"),
("Sham",70,"8879687058"),
("Anil",90,"9576937587"),
("Mukesh",80,"7789708789");

SELECT * FROM student;

DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts(id INT, type CHAR(30), balance DOUBLE);
INSERT INTO accounts VALUES (1, 'Saving', 30000.00);
INSERT INTO accounts VALUES (2, 'Saving', 2000.00);
INSERT INTO accounts VALUES (3, 'Saving', 10000.00);
SELECT * FROM accounts;