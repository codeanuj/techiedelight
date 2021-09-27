  public static boolean isSymmetric(Node root)
    {
        // add your code here;
        
        if(root==null) return true;
        
        return isSymmtry(root.left, root.right);
    }
    
    static boolean isSymmtry(Node root1, Node root2){
        if(root1 == null && root2 ==null) return true;
   
        return ((root1!=null && root2!=null && root1.data==root2.data) && isSymmtry(root1.left, root2.right) && isSymmtry(root1.right, root2.left));
    }
