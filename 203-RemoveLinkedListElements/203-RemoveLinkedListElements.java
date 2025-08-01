// Last updated: 8/1/2025, 1:57:17 PM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=new ListNode(-1);
        curr.next=head;
        ListNode start=curr;
        while(start.next !=null){
            if(start.next.val==val){
                start.next=start.next.next;
            }
            else{
                start=start.next;
            }
        }
        return curr.next;
        
    }
}