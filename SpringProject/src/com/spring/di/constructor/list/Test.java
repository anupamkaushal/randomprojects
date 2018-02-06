package com.spring.di.constructor.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/constructor/list/applicationContext.xml");
		
	Question emp =(Question) context.getBean("questionbean");
	emp.show();

	}

}
