/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
              
        if(head.next==null){
             return null;
        }
        //create a dummy node for edge cases where need to delete head
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode left=dummy;
        ListNode right=dummy;
        
        for(int i=0; i<n; i++){
            right=right.next;
        }
        
        while(right.next!=null){
            left=left.next;
            right=right.next;
        }
        
        
        left.next=left.next.next;

        return dummy.next;
    }
}
