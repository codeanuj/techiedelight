 public Node connect(Node root) {
        
        if(root==null) return root;
        
        Queue<Node> q =new LinkedList<Node>();       
        q.add(root);
        int size=0;
        Node node=null;
        
        while(!q.isEmpty()){
           size=q.size();
           
            for(int i=0; i<size; i++){
                node=q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                
                if(i==size-1)
                    node.next=null;
                else
                    node.next=q.peek();
            }
        }
        
        return root;
    }
