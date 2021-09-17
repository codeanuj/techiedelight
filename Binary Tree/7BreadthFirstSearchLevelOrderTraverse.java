 static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList <Integer> list = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        
        queue.add(node);
        
        while(!queue.isEmpty()){
            int curr_size= queue.size();
            for(int i=0; i<curr_size; i++){
                Node current=queue.remove();
                list.add(current.data);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
        }
        
        return list;
    }
