package com.informationasset.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserRecord1")
public class Employee {
@Id
int id;
String name, email;
double salary;
public double getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee(int id, String name, String email, double d) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.salary = d;
}


}
