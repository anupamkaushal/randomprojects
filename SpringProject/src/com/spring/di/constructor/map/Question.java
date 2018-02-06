package com.spring.di.constructor.map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;  
	private String name; 
	private Map<String,String> answers;
	
	// Define  Constructor
	
	Question()
	{		
		System.out.println("def cons");
	}

	
	public Question(int id, String name, Map<String,String> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	void show(){  
	    System.out.println(id+" "+name); 
	    
	    Set<Entry<String,String>> set = answers.entrySet();
	    
	    Iterator<Entry<String, String>> itr = set.iterator();
	    while(itr.hasNext())
	    {
	    	Entry entry =(Entry)itr.next();
	    	System.out.println(entry.getKey() + " " + entry.getValue());
	    	
	    }
	    
	  
	} 
	
}
