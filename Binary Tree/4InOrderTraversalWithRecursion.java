class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> inOrder(Node root) {
        traverse(root);
        return list;
    }
    
    void traverse(Node root){
        if(root==null) return;
        traverse(root.left);
        list.add(root.data);
        traverse(root.right);
    }
}
