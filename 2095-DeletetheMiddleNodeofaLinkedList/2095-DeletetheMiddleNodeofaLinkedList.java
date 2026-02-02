// Last updated: 2/2/2026, 11:47:53 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next==null){
14            return null;
15        }
16        ListNode slow=head;
17        ListNode fast=head;
18        ListNode prev=null;
19
20        while(fast!=null && fast.next!=null){
21            prev=slow;
22            slow=slow.next;
23            fast=fast.next.next;
24        }
25        prev.next=slow.next;
26
27        return head;
28
29        
30    }
31}