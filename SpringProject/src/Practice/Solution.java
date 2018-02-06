package Practice;

import java.util.*;

public class Solution {
	
	 private static final int MAX = 100000;
	
	public static void main(String[] args) {
		
		
		  int A[] = {6, 6, 3, 9, 3, 5,1};
	        int n = 12;
	        numberOfPairs(A,  n);
	}
		 static int numberOfPairs(int[] a, long k) { 
			 
			 HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
			 
			 int count = 0;
			 
			 boolean[] map = new boolean[MAX];
			 
		        for (int i=0; i<a.length; ++i)
		        {
		            int temp = (int)k-a[i];
		 
		            // checking for condition
		            if (temp>=0 && map[temp])
		            {
		               
		            	map1.put(a[i],temp+a[i]);
		            	map1.put(a[i],temp+a[i]);
		               count++;
		            }
		            map[a[i]] = true;
		        }

		        System.out.println(map1.size());
		        return map1.size();
		    }
		 
		
		
		
	

}
