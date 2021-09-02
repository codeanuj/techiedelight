/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class DuplicateParantheses {
	public static void main (String[] args) {
	    
	    Stack<Character> stack = new Stack<Character>();
	    String s="(a+(b))";
	    for(int i=0; i<s.length(); i++){
	        
	        char c= s.charAt(i);
	        
	        if(c==')'){
	           char top=stack.pop();
	           
	           int count=0;
	           while(!stack.isEmpty() && stack.peek()!='('){
	              stack.pop();
	              count++;
	          }
	        
	        if(count<1){
	            System.out.println("false");
	            break;
	        }
	    }
	    else{
	        stack.push(c);
	    }
	    }
	    System.out.println("true;");
	    
	}
}
