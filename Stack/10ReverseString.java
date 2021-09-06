public static void main (String[] args) {
	    
	    Stack<Character> stack = new Stack<Character>();
	    String s="Hello, World";
	    for(int i=0; i<s.length(); i++){
	       stack.push(s.charAt(i)); 
	    }
	  StringBuilder sb=new StringBuilder();
	  while(!stack.empty()){
	      sb.append(stack.pop());
	  }
	    System.out.println(sb.toString());
	}
