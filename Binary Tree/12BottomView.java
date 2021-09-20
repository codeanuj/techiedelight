  public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList <Integer> result = new ArrayList <Integer>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o1-o2;
            }
        });
        Queue<Node> q= new LinkedList<Node>();
        if(root==null) return result;
        root.hd=0;
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i=0; i<size; i++){
             
                Node node = q.poll();
                int key=node.hd;
                if(map.containsKey(key)){
                    ArrayList<Integer> l=map.get(key);
                    l.add(node.data);
                    map.put(key, l);
                }else{
                    ArrayList<Integer> l=new ArrayList<Integer>();
                    l.add(node.data);
                    map.put(key, l);
                }
                
                if(node.left!=null){
                    node.left.hd=key-1;
                    q.add(node.left);
                }
                
                if(node.right!=null){
                    node.right.hd=key+1;
                    q.add(node.right);
                }
            }
        }
        
        for (Map.Entry<Integer,ArrayList<Integer>> e : map.entrySet()) {
             
              ArrayList<Integer> o = e.getValue();
              result.add(o.get(o.size()-1));
        }
        
        return result;
    }
