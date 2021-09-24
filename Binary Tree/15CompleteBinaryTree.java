	boolean isCompleteBT(Node root)
    {
        if(root == null) return true;
        
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            
                Node n=q.remove();
                if(n.left!=null){
                    
                  if(flag==true){
                    return false;
                  }
                  q.add(n.left);
                }
                else{
                    flag=true;
                }
                
                if(n.right!=null){
                    
                    if(flag==true){
                         return false;
                    }
                     
                    q.add(n.right);
                }
                else{
                    flag=true;
                }
        }
        
        return true;
