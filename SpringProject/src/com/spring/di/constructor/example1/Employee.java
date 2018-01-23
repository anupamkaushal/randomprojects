package com.spring.di.constructor.example1;

public class Employee {
	
	private int id;  
	private String name;  
	
	// Define  Constructor
	
	Employee()
	{		
		System.out.println("def cons");
	}

	
	Employee (int id)
	{
		this.id = id;
	}
	
	public Employee(String name) 
	{  
		this.name = name;
	}  
	  
	public Employee(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	
	void show(){  
	    System.out.println(id+" "+name);  
	} 
	
}
