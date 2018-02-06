package com.spring.di.constructor.dependentObjList;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;  
	private String name; 
	private List answers;
	
	// Define  Constructor
	
	Question()
	{		
		System.out.println("def cons");
	}

	
	public Question(int id, String name, List answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	void show(){  
	    System.out.println(id+" "+name); 
	    
	    Iterator itr = answers.iterator();
	    while(itr.hasNext())
	    {
	    	String ans =(String)itr.next();
	    	System.out.println(ans.toString());
	    	
	    }
	    
	  
	} 
	
}
