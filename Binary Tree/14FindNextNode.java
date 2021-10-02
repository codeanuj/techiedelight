public void connect(Node root)
    {

        Node temp_v=root;
        
        while(temp_v!=null){
            Node temp_h=temp_v;
            while(temp_h!=null){
                
                if(temp_h.left!=null){
                    if(temp_h.right!=null){
                        temp_h.left.nextRight=temp_h.right;
                    }else{
                        temp_h.left.nextRight=getNextRight(temp_h.nextRight);
                    }
                }
                if(temp_h.right!=null){
                    temp_h.right.nextRight=getNextRight(temp_h.nextRight);
                }
                
                temp_h=temp_h.nextRight;
            }
            
            if(temp_v.left!=null){
                temp_v=temp_v.left;
            }else if(temp_v.right!=null){
                temp_v=temp_v.right;
            }else{
                temp_v=temp_v.nextRight;
            }
        }
        
     }
    
     public Node getNextRight(Node curr){
        if(curr==null) return curr;
        if(curr.left!=null) return curr.left;
        if(curr.right!=null) return curr.right;
        Node n=getNextRight(curr.nextRight);
        return n;
    }
