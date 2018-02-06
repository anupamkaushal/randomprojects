package com.spring.di.constructor.list;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;  
	private String name; 
	private List<Answer> answers;
	
	// Define  Constructor
	
	Question()
	{		
		System.out.println("def cons");
	}

	
	public Question(int id, String name, List<Answer> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	void show(){  
	    System.out.println(id+" "+name); 
	    
	    Iterator<Answer> itr = answers.iterator();
	    while(itr.hasNext())
	    {
	    	Answer ans = (Answer)itr.next();
	    	System.out.println(ans.toString());
	    	
	    }
	    
	  
	} 
	
}
