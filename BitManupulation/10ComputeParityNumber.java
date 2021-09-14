/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	   int x=2;
	   
	   x ^=(x>>16);
	   x ^=(x>>8);
	   x ^=(x>>4);
	   x ^=(x>>2);
	   x ^=(x>>1);
	   
	   if((x&1)==1){
	       System.out.println("Odd");
	   }else{
	       System.out.println("Even");
	   }
	}
}
