 public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //take a stack to add element
        Stack<Integer> stack = new Stack();
        Queue<Node> q = new LinkedList();
        if(q!=null)
          q.add(node);
        
        int size=0;
        while(!q.isEmpty()){
            size=q.size();
            
            for(int i=0; i<size; i++){
                Node current_node= q.remove();
                //take right then left because in stack order will get reversed
                if(current_node.right!=null) q.add(current_node.right);
                if(current_node.left!=null) q.add(current_node.left);
                stack.push(current_node.data);
            }
            
        }
        
        while(!stack.empty()){
            list.add(stack.pop());
        }
        
        return list;
    }
