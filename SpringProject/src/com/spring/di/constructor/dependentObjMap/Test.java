package com.spring.di.constructor.dependentObjMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/constructor/dependentObjMap/applicationContext.xml");
		
	Question emp =(Question) context.getBean("questionbean");
	emp.show();

	}

}
