class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      
        if(l1 == null && l2!=null) return l2;
        
        if(l1!=null && l2!=null && l1.val>l2.val){
            ListNode tmp = l1;
            l1=l2;
            l2=tmp;
        }
        
        ListNode result =l1;
        
        while(l1!=null && l2!=null){
            ListNode tmp=null;
            
            while(l1!=null && l1.val<=l2.val){
                tmp=l1;
                l1=l1.next;
            }
            
            tmp.next =l2;
            
            ListNode temp = l2;
            l2=l1;
            l1=temp;
        }
        
        return result;
    }
}
