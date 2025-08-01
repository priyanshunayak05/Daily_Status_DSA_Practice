// Last updated: 8/1/2025, 1:57:33 PM
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        // Find the middle of the list
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode preMiddle = p1;
        ListNode precurr = p1.next;

        // Reverse the second half of the list in-place
        while (precurr.next != null) {
            ListNode current = precurr.next;
            precurr.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        // Merge the two halves
        p1 = head;
        p2 = preMiddle.next;

        while (p1 != preMiddle) {
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }

        return;
    }
}