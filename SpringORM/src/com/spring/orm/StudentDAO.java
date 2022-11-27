package com.spring.orm;

import java.util.List;

import javax.sql.DataSource;

//dao is similar to persistent class in hibernate
//dao:Data Access Object
public interface StudentDAO {

	//abstract methods
	//Datasource is from java library which will
	//interact with the database
	public void setDataSource(DataSource ds);
	
	public void create(String name,Integer age);
	
	public Student getStudent(Integer id);
	
	public List<Student> listOfStudents();
	
	public void delete(Integer id);
	
	public void update(Integer id,Integer age);
}
