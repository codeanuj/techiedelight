class Solution
{
    static Node node;
    int[] result;
    int i=0;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here
        node= constructBST(nums,0,nums.length-1);
         result= new int[nums.length];
        inOrderTraversal(node);
        return result;
    }
    
    void inOrderTraversal(Node curr){
        if(curr==null) return;
        result[i++]=curr.data;
        inOrderTraversal(curr.left);
        inOrderTraversal(curr.right);
    }
    
    Node constructBST(int[] nums, int low, int high){
        
        if(low>high) return null;
        int mid=(low+high)/2;
        Node root = new Node(nums[mid]);
        
        root.left = constructBST(nums,low,mid-1);
        root.right= constructBST(nums,mid+1, high);
        
        return root;
    }
}

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
