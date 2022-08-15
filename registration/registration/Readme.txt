This Code Demonstrates use of Spring JPA and Thymleaf together to create a Registratio Form. Database used is MySQL.

#For Selecting Database
use test;

#For Creating Table
CREATE TABLE registration(course varchar(15), 
dob varchar(30), 
email varchar(50),
first_name varchar(15), 
gender varchar(15),
last_name varchar(20),
mobile_number varchar(10),
password varchar(15));

#I Forgot to add 1 column and needed it as primary key with auto increment so used below query
ALTER TABLE registration add id INT NOT NULL AUTO_INCREMENT FIRST, ADD PRIMARY KEY (id);
