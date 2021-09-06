class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        
        if(s1.empty()&& s2.empty())
           return -1;
           
	   if(s2.empty()){
	       while(!s1.empty()){
	          s2.push(s1.pop());
	   }
	   }
	   
	   
	   return s2.pop();
    }
}
