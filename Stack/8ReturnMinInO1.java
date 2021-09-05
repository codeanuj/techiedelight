 int min;
	public void push(int a,Stack<Integer> s){
	    
	    if(isEmpty(s)){
	        s.push(a);
	        min=a;
	    }else if(min<a){
	        s.push(a);
	    }else{
	        s.push(2*a-min);
	        min=a;
	   }
	}
	public int pop(Stack<Integer> s){
	    int p=0;
       if(s.peek()>min){
           p= s.pop();
       }else{
           p=2*min-s.pop();
       }
       
       return p;
	}
	public int min(Stack<Integer> s){
	    return min;
	}
	public boolean isFull(Stack<Integer>s, int n){
          if(s.size()==n){
              return true;
          }
          return false;
	}
	public boolean isEmpty(Stack<Integer>s){
          if(s.size()==0){
              return true;
          }
          return false;
	}
