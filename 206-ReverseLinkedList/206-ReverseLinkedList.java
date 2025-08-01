// Last updated: 8/1/2025, 1:57:13 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr !=null){
            ListNode Ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Ahead;
        }
        return prev;
    }
    }