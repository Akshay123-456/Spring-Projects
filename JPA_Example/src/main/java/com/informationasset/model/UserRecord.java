package com.informationasset.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userrecord")
public class UserRecord {
@Id
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="username")
private String username;
@Column(name="email")
private String email;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
