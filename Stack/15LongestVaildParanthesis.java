 public int longestValidParentheses(String s) {
     
       Stack<Integer> stack = new Stack();
        stack.push(-1);
        int result=0;
        int length;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                
                stack.pop();
                
                if(stack.empty()){
                    stack.push(i);
                    continue;
                }
                
                length=i-stack.peek();
                result=Math.max(length, result);
            }
        }
        
        return result;
    }
