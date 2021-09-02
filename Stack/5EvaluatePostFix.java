 public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack = new Stack();
        int o1=0;
        int o2=0;
        for(int i=0; i<S.length(); i++){
            char c =S.charAt(i);
            switch(c)
            {
               case '+':  o1=stack.pop();
                          o2=stack.pop();
                         stack.push(o2+o1);
                         break;
               case '-':  o1=stack.pop();
                          o2=stack.pop();
                         stack.push(o2-o1);
                         break;
               case '*':  o1=stack.pop();
                          o2=stack.pop();
                         stack.push(o2*o1);
                         break;
               case '/':  o1=stack.pop();
                          o2=stack.pop();
                         stack.push(o2/o1);
                         break;
               default: stack.push(Integer.parseInt(String.valueOf(c)));
        }
    }
        return stack.pop();
