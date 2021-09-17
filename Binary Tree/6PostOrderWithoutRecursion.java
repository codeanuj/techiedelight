ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       Stack<Node> stack = new Stack<Node>();
       Node curr= root;
       Node temp=null;
       while(curr!=null || !stack.empty()){
           
           if(curr!=null){
               stack.push(curr);
               curr=curr.left;
           }else{
               Node tmp=stack.peek();
               temp=tmp.right;
               
               if(temp==null){
                   temp=stack.pop();
                   list.add(temp.data);
                   while(!stack.empty() && temp==(stack.peek()).right){
                       temp=stack.pop();
                       list.add(temp.data);
                   }
                   
               }else{
                   curr=temp;
               }
               
           }
       }
       return list;
    }
