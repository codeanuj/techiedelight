/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	  int[] A = {2, 6, 9, 12, 17, 22, 31, 32, 35, 42};
	  ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	  for(int i=1; i<A.length-1; i++){
	      
	      int low=i-1;
	      int high = i+1;
	      while(low>=0 && high<A.length){
	          
	          if(A[low] + A[high] == 2*A[i]){
	              ArrayList<Integer> l= new ArrayList<Integer>();
	              l.add(A[low]);
	              l.add(A[i]);
	              l.add(A[high]);
	              list.add(l);
	              high++;
	              low--;
	          }else if(A[low] + A[high]>2*A[i]){
	              low--;
	          }else{
	              high++;
	          }
	          
	      }
	  }
	 System.out.println(list);
	  
	}
}
