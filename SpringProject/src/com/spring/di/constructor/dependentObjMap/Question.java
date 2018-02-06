package com.spring.di.constructor.dependentObjMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;  
	private String name; 
	private Map<Answer,User> answers;
	
	// Define  Constructor
	
	Question()
	{		
		System.out.println("def cons");
	}

	
	public Question(int id, String name, Map<Answer,User> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	void show(){  
	    System.out.println(id+" "+name); 
	    
	    Set<Entry<Answer,User>> set = answers.entrySet();
	    
	    Iterator<Entry<Answer, User>> itr = set.iterator();
	    while(itr.hasNext())
	    {
	    	Entry entry =(Entry)itr.next();
	    	Answer ans = (Answer)entry.getKey();
	    	User user  = (User)entry.getValue();
	    	System.out.println(ans);
	    	System.out.println(user);
	    	
	    	
	    	
	    	
	    }
	    
	  
	} 
	
}
