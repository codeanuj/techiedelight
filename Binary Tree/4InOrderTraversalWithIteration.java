class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack =new Stack<Node>();
        Node curr=root;
        while(curr!=null || !stack.empty()){
            
            if(curr!=null){
                stack.add(curr);
                curr=curr.left;
            }else{
                Node tmp= stack.pop();
                list.add(tmp.data);
                curr=tmp.right;
            }
        }
        return list;
    }
    
    
}
