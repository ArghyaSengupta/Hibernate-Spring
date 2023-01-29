package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Step 3
public class MainApp {
	
	public static void main(String args[]) {
		//IOC is the concept and DI is the practical use
		//Inversion of control Container: Application Context
		//input 1
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		//mapping with the xml file
		//pojo: registration (input 2
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		//HelloWorld obj1= (HelloWorld)context.getBean("helloWorld1");
		//get the message
		//output
		obj.getMessage();
		
	}

}
