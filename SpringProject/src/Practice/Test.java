package Practice;
import java.util.*;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		 oddNumbers(3,5);
	}	
		
		static int[] oddNumbers(int l, int r) {
	        
		       List<String> oddsN = new ArrayList<String>();
		      for(int i= l;i<=r;i++)
		      {
		          if((i%2)!=0)
		          {
		              oddsN.add(i+"");
		          }
		      }
		   int odds[] = new int[oddsN.size()];              
	    	for(int i =0;i<oddsN.size();i++){
	    		int n = Integer.parseInt(oddsN.get(i));
	    		odds[i] = n;
		  

	    }
		return odds;

		}
		
		
		
		 static String findNumber(int[] arr, int k) {
		        
		        
		        for(int i =0;i<arr.length;i++)
		        {
		        	if( arr[i]==k)
		        		return "YES";
		        }

               return "NO";
		    }

}
