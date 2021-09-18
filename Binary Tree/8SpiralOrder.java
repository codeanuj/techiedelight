  ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
       Deque<Node> dq = new ArrayDeque<>();
         
        //Insert the root of the tree into the deque
        if(root!=null)
         dq.offer(root);
         
        //Create a  variable that will switch in each iteration
        boolean reverse = true;
 
        //Start iteration
        while (!dq.isEmpty()){
             
             
            int n = dq.size();
             
              //If we are printing left to right
            if(!reverse){
               
              //Iterate fron left to right
                for (int i =0; i < n; i++){
                         
                  //Insert the child from the back of the deque
                  //Left child first
                    if (dq.peekFirst().left  != null)
                        dq.offerLast(dq.peekFirst().left);
                   
                    if (dq.peekFirst().right != null)
                        dq.offerLast(dq.peekFirst().right);
                   
                  //Print the current processed element
                    list.add(dq.pollFirst().data);
                   
                   
                }
            
                reverse = !reverse;
               
            }else{
 
              //If we are printing right to left
              //Iterate the deque in reverse order and insert the children
              //from the front
                while (n-- >0){
                    //Insert the child in the front of the deque
                    //Right child first
                    if (dq.peekLast().right != null)
                        dq.offerFirst(dq.peekLast().right);
                   
                    if (dq.peekLast().left != null)
                        dq.offerFirst(dq.peekLast().left);
 
                  //Print the current processed element
                  list.add(dq.pollLast().data);
                   
 
                }
    
                reverse = !reverse;
                 
            }
        }
        return list;
    }
