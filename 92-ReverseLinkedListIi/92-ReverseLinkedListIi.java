// Last updated: 8/1/2025, 1:57:46 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode leftpre=dummy;
        ListNode currNode=head;


        for(int i=0;i<left-1;i++){
            leftpre=leftpre.next;
            currNode=currNode.next;

        }
        ListNode subListHead=currNode;
        ListNode preNode=null;
        for(int i=0;i<=right-left;i++){
            ListNode nextnode=currNode.next;
            currNode.next=preNode;
            preNode=currNode;
            currNode=nextnode;
        }
        leftpre.next=preNode;
        subListHead.next=currNode;
        return dummy.next;
    }
}