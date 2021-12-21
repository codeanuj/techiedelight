 public ListNode deleteDuplicates(ListNode head) {
        
     
        if(head == null) return head;
        ListNode left = head;
        ListNode right = head.next;
      //take two pointer and make changes according 
        while(right != null){
            if(right.val == left.val){
                left.next = right.next;
                right = right.next;
            }
            else{
                left = right;
                right = right.next;
            }
        }
        return head;
    }
