package com.spring.ioc.example.beanFactory;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
    	  //BeanFactory and ApplicationContext are IOC container.
    	 //The IoC container is responsible to instantiate, configure and assemble the objects.
    	   Resource resource=new ClassPathResource("com/spring/ioc/example/beanFactory/applicationContext.xml");  
    	   BeanFactory factory=new XmlBeanFactory(resource);  
    	    
    	    
    	    Student student=(Student)factory.getBean("studentbean");  
    	    student.displayInfo();  
    	}  
          
    }  
