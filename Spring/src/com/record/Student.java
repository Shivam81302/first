package com.record;

public class Student {  
private String name;
public int id;

  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  

public int getid() {
	return id;
}

public void setid(int id) {
	this.id= id;
}
public void displayInfo(){  
    System.out.println("Hello: "+name);  
    System.out.println("Your id is: "+id);
}  
} 