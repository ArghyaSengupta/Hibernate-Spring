package com.hibernate.cache;
    

import org.hibernate.Session;    
import org.hibernate.SessionFactory;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
    
public class Fetch {    
public static void main(String[] args) {    
    
	//---//
	StandardServiceRegistry ssr=
	new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  //only once
        
    
    Session session1=factory.openSession();   
    
    //---//
    EmployeeDAO emp1=(EmployeeDAO)session1.load(EmployeeDAO.class,121);    
    System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());    
    session1.close();    
        
    Session session2=factory.openSession();    
    EmployeeDAO emp2=(EmployeeDAO)session2.load(EmployeeDAO.class,121);    
    System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());    
    session2.close();    
        
}    
}    
