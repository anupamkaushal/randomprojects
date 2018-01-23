package com.spring.di.constructor.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/constructor/example1/applicationContext.xml");
		
	Employee emp =(Employee) context.getBean("employeebean");
	emp.show();

	}

}
