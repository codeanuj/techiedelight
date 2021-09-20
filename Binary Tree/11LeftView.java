ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list = new ArrayList<Integer>();
      Queue<Node> q= new LinkedList();
      if(root==null) return list;
      q.add(root);
      
      while(!q.isEmpty()){
          int size=q.size();
          
          for(int i=0; i<size; i++){
              Node n=q.poll();
              if(i==0)
                list.add(n.data);
            
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
          }
      }
      
      return list;
    }
