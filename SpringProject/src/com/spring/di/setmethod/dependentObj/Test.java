package com.spring.di.setmethod.dependentObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/setmethod/dependentObj/applicationContext.xml");
		
	Employee emp =(Employee) context.getBean("employeebean");
	emp.show();

	}

}
