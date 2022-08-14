package com.informationasset.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Registration")
@Getter
@Setter
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;
@Column(name="gender")
private String gender;
@Column(name="course")
private String course;
@Column(name="email")
private String email;
@Column(name="password")
private String password;
@Column(name="mobile_number")
private String mobileNumber;
@Column(name="dob")
private String dob;
}
