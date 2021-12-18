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
    public int numComponents(ListNode head, int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        boolean prev_connect =false;
        ListNode curr=head;
        int count=0;
        //take a set and put num array in set as you need access in o(1)
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);
        
        while(curr!=null){
            //prev node was not from nums array and set contains current node then this will be 1 component
            if(!prev_connect && set.contains(curr.val))
                count++;
          //is set contains current value then make prev_connect as true because if you come again and for next current value if value exist in set then this will be single 
          //component counted as different
            if(set.contains(curr.val))
                prev_connect=true;
            else
                prev_connect=false;
            
            curr=curr.next;
        }
        
        return count;
        
    }
}
