 public void toSumTree(Node root){
        postOrder(root);
    }
    
    int postOrder(Node root){
         if(root==null) return 0;
         
         int a=root.data;
         root.data=postOrder(root.left)+postOrder(root.right);
         return a+root.data;
    }
