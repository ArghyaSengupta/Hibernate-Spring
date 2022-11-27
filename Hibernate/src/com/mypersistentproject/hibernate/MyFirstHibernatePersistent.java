package com.mypersistentproject.hibernate;

public class MyFirstHibernatePersistent {

	
	public int id;//identifier:col1
	public String firstName;//col2
	public String lastName;//col3
	
//POJO:PLAIN OLD JAVA OBJECT:getter-setter
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
