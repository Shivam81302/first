package com.record;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{  
	@Id
	@Column(name="first_name")	
private String first_name;
	@Column(name="id")
public int id;
	@Column(name="last_name")
private String last_name; 
	@Column(name="email")
public String email;
  
public Student(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getfirst_Name() {  
    return first_name;  
}  
  
public void setfirst_Name(String first_name) {  
    this.first_name = first_name;  
}  

public int getid() {
	return id;
}

public void setid(int id) {
	this.id= id;

}

@Override
public String toString() {
	return "Student [first_name=" + first_name + ", id=" + id + ", last_name=" + last_name + ", email=" + email + "]";
}  
} 