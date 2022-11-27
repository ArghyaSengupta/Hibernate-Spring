package com.spring.orm;

import java.util.List;

import javax.sql.DataSource;

//JDBC template that allows us to use the interface nethods
public class StudentJDBCTemplate implements StudentDAO{

	
	private DataSource dataSource;
	   private StudentJDBCTemplate jdbcTemplateObject;
	   
	   public StudentJDBCTemplate(DataSource dataSource2) {
		// TODO Auto-generated constructor stub
	}
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new StudentJDBCTemplate(dataSource);
	   }
	   public List<Student> listStudents() {
	      String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	   }
	   private List<Student> query(String sQL, StudentMapper studentMapper) {
		// TODO Auto-generated method stub
		return null;
	}
	public void delete(Integer id) {
	      String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }
	   public void update(String sQL2, Integer age){
	      String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age);
	      System.out.println("Updated Record with ID = " + sQL2 );
	      return;
	   }
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Student getStudent(Integer id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Student> listOfStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}
}
