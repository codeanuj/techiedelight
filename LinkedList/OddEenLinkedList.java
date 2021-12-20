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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null) return head;
        
        ListNode index1=head;
        ListNode index2=head.next;
        ListNode temp=index2;
        
        //idea is two take two pointer and seprate out two list 
        //later merge index2 with tail of first list(index1)
        while( index1.next !=null && index2.next !=null){
            index1.next=index1.next.next;
            index1=index1.next;
            index2.next=index2.next.next;
            index2=index2.next;
        }
        
        index1.next=temp;
        return head;
    }
}
