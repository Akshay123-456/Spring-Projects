package com.informationasset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.Entity;  
import javax.persistence.Id;  
@Entity
@Table(name="employee") 
public class UserRecord   
{   
@Id    
private int id;    
private String name;    
private String email;  
//default conatructor    
public UserRecord() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId()   
{    
return id;    
}    
public void setId(int id)   
{    
this.id = id;    
}    
public String getName()   
{    
return name;    
}    
public void setName(String name)   
{    
this.name = name;    
}    
public String getEmail()   
{    
return email;    
}    
public void setEmail(String email)   
{  
this.email = email;    
}    
}    