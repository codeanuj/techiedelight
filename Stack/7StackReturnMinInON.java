Stack<Integer> stack=new Stack();
	public void push(int a,Stack<Integer> s)
	{
	    if(isEmpty(s)){
	       s.push(a);
	       stack.push(a);
	    }else{
	        s.push(a);
	        int top=stack.peek();
	        
	        if(top>a){
	            stack.push(a);
	        }else{
	            stack.push(top);
	        }
	    }
	}
	public int pop(Stack<Integer> s)
        {
         int top=s.pop();
         stack.pop();
         return top;
	}
	public int min(Stack<Integer> s)
        {
         return stack.peek();  
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           if(s.size()==n){
               return true;
           }
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           if(s.size()==0){
               return true;
           }
           return false;
	}
