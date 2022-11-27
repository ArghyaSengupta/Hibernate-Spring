package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Step 3
public class MainApp {
	
	public static void main(String args[]) {
		
		//Ioc Container
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		//mapping with the xml file
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		//get the message
		obj.getMessage();
		
	}

}
