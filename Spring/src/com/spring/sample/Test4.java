package com.spring.sample;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;//core
import org.springframework.core.io.Resource;//core:beans,context,core,EL  
 
  
public class Test4 {  
    public static void main(String[] args) {  
        //resolves the anomaly of file source:bean source  
        Resource r=new ClassPathResource("applicationContext1.xml"); 
        //bean factory uses resource
        BeanFactory factory=new XmlBeanFactory(r);  
        //BeanFactory factory1=new XmlBeanFactory(new ClassPathResource("applicationContext1.xml"));  
        Employee2 s=(Employee2)factory.getBean("e");  
        s.show(); 
        
        Employee2 s1=(Employee2)factory.getBean("e1");
        s1.show();
          
    }  
}  
