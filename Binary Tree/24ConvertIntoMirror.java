void mirror(Node node) {
        // Your code here
        convertMirror(node);
     }
    
    void convertMirror(Node root){
        
        if(root==null) return;
        
        
        
        convertMirror(root.left);
        convertMirror(root.right);
        Node roott =root.left;
        root.left=root.right;
        root.right=roott;
    }
