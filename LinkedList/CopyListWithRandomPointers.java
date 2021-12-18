/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head==null) 
            return head;
        
        Node head2= new Node(head.val);
        Node prev =head2;
        Node head1=head.next;
      //create new linked list
        while(head1!=null){
            Node tmp = new Node(head1.val);
            prev.next=tmp;
            prev=tmp;
            head1=head1.next;
        }
        
      //put original and copy in hashmap
        HashMap<Node, Node> map = new HashMap();
        
        Node tmp1 = head;
        Node tmp2=  head2;
        
        while(tmp1!=null && tmp2!=null){
            map.put(tmp1, tmp2);
            tmp1=tmp1.next;
            tmp2=tmp2.next;
        }
        
      //your's copy random pointer will be where your's original randon is pointing in hashmap i.e. key // the key value will be random copy pointer for copy linked list
        head1=head;
        while(head1!=null){
            Node copy = map.get(head1);
            Node copy_rand=null;
            if(head1.random!=null)
               copy_rand= map.get(head1.random);
            copy.random = copy_rand;
            head1=head1.next;  
        }
        
        return head2;
    }
}
