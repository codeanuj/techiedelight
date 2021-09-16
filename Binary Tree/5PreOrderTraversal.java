static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        
        Node curr = root;
        while(curr!=null || !stack.empty()){
            
            if(curr!=null){
                list.add(curr.data);
                stack.push(curr);
                curr=curr.left;
            }else{
                Node tmp=stack.pop();
                curr=tmp.right;
            }
        }
        return list;
    }
