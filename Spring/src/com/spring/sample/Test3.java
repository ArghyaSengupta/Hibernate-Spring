package com.spring.sample;

import java.io.InputStream;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;  
  
public class Test3 {  
    public static void main(String[] args) { 
    	//2 IOC Containers: Bean Factory and ApplicationContext
        //1. Create resource object
    	//2. Pass the respurce object to XMLBeanFactory
    	//Use the factory instance to get the specific bean
        Resource resource=(Resource) new ClassPathResource("applicationContext.xml"); 
        //factory object contains all the data
        BeanFactory factory=new XmlBeanFactory((InputStream) resource);  
          
        Employee e=(Employee)factory.getBean("obj");  //bean id : obj1
        Employee e1=(Employee)factory.getBean("obj1");  //bean id obj2
        e.display();
        e1.display();
          
    }  
}  
