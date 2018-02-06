package com.spring.di.constructor.dependentObjMap;

public class Answer{
	
	private String id;  
	private String name;  
	private String by; 
	
	public Answer(String id, String name, String by) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.by = by;  
	}  
	
	public String toString(){  
	    return id+" "+name+" "+by;  
	}  
	

}
