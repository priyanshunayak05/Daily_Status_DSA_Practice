// Last updated: 11/6/2025, 7:42:35 PM
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
        if(head==null)return null;
        Map<Node,Node>m=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            m.put(curr,new Node(curr.val));
            curr=curr.next;
        }


        curr=head;
        while(curr!=null){
            m.get(curr).next=m.get(curr.next);
            m.get(curr).random=m.get(curr.random);
            curr=curr.next;
        }
        return m.get(head);
    }
}