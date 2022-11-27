package com.students.batch;  
 
//characteristics of a persistent class
//(database table representative

//no arg constructor-1
//identifier :id :pk of they table-2
//getter-setter:pojo -3
//non final class : non constant/modifiable -4

public class Employee //class

{  
private int id;//primary key : 
//non duplicate values :generated
private String firstName,lastName;//properties  
  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
  
  
}  