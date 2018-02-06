package com.spring.di.setmethod.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/di/setmethod/example/ApplicationContext.xml");
	Employee emp=(Employee)ctx.getBean("employeebean");
	emp.show();
		

	}

}
