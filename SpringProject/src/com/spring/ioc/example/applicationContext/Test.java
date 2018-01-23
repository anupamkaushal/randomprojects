package com.spring.ioc.example.applicationContext;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
    	  //BeanFactory and ApplicationContext are IOC container.
    	 //The IoC container is responsible to instantiate, configure and assemble the objects.
    	    
    	    
    	    ApplicationContext context =   
    	    	    new ClassPathXmlApplicationContext("com/spring/ioc/example/applicationContext/applicationContext.xml");  
    	      
    	    Student student=(Student)context.getBean("studentbean");  
    	    student.displayInfo();  
    	}  
          
    }  
