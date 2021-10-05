public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null) return root;
        
        if(root.data>X){
            root.left = deleteNode(root.left, X);
        }else if(root.data<X){
            root.right = deleteNode(root.right, X);
        }else{
           //if leaf node to be deleted
            if(root.left==null && root.right==null){
            root=null;
            return root;
            }//if node has just one child 
          else if(root.right==null || root.left==null){
                Node temp=root;
                root=(root.right==null)?root.left:root.right;
                temp=null;
                return root;
            }else{
              //if both children are present
                Node temp=findMinOnRightSubTree(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
            }
            
        }
    return root;
    }
    //you can also write findMaxOnLeftSubtree while passing node.left
    public static Node findMinOnRightSubTree(Node curr){
       while(curr.left!=null){
         curr=curr.left;
       }
       return curr;
    }
