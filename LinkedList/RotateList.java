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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return head;
        ListNode curr = head;
        ListNode tail=null;
        int length=0;
      //basic idea is find out tail pointer and linked with head(cyclic linked list)
        while(curr!=null){
            length++;
            tail=curr;
            curr=curr.next;  
        }
        
      
        if(k==length) return head;
      
        if(k>length) k=k%length;
      //as needed to rotate from back ex k=7 and length=9 then k=2
      //so 2nd pointer from tail the list should be cut off i.e this pointer will be new tail
        k=length-k;
      //reuse length var
        length=0;
        curr=head;
        //k-1 because we started our counter from 0
        while(length!=k-1){
            length++;
            curr=curr.next;
        }
        tail.next=head;
        ListNode result=curr.next;
        curr.next=null;
        return result;
        
    }
}
