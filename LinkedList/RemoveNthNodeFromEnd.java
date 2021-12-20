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
      
                
        
        int length =0;
        int count =0;
        
        ListNode curr=head;
        //find the length of list
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        
        curr=head;
        if(n==length){
            ListNode tmp=curr.next;
            head.next=null;
            return tmp;
        }
        //fnd the pre node of the node that has to be deleted
        length=length-n;
        //go till that step
        while(count!=length-1){
            count++;
            curr=curr.next;
        }
        
        ListNode tmp=curr.next;
        curr.next=tmp.next;
        tmp.next=null;
        
        return head;
        
        
    }
}
