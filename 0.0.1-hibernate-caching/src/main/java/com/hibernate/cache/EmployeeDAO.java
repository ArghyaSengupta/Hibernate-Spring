package com.hibernate.cache;

import javax.persistence.*;  
import org.hibernate.annotations.Cache; //new1 
import org.hibernate.annotations.CacheConcurrencyStrategy; //new2


//cacheable : used to maintain one connection everytime
//cache(CacheConcurrencyStrategy.Readonly : connection 
//once created shouldnot be changed
//DAO :Data Access Object

@Entity  
@Table(name="emsp1012")  
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class EmployeeDAO {    
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;//obj1    
private String name; //obj2   
private float salary;    //obj3


//default constructor
public EmployeeDAO() {} 

//parameterized constructor
public EmployeeDAO(String name, float salary) {    
    super();  //it calls the super parent  
    this.name = name;    
    this.salary = salary;    
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

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}  

}    

