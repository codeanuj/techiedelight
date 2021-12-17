/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //by slow and fast pointer approach as if there is a loop then slow_p and fast_p will meet each other
        ListNode slow_p = head;
        ListNode fast_p = head;
        
        while(fast_p!=null && fast_p.next!=null){
            
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            
            if(fast_p == slow_p) return true;
        }
        
        return false;
    }
}
