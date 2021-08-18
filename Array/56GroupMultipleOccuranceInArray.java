/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	  int[] A = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
	 
	  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	  for(int i=0; i<A.length; i++){
	      map.put(A[i], map.getOrDefault(A[i], 0)+1);
	  }
	  
	  for(int i=0; i<A.length; i++){
	      
	      if(map.containsKey(A[i])){
	          int freq = map.get(A[i]);
	          
	          while(freq!=0){
	              System.out.println(A[i]);
			  freq--;
	          }
	          
	          map.remove(A[i]);
	      }
	  }
	}
}
