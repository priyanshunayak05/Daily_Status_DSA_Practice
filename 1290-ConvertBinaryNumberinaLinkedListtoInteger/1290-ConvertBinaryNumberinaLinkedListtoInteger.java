// Last updated: 2/2/2026, 11:32:03 AM
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
12    public int getDecimalValue(ListNode head) {
13        String s="";
14        ListNode curr=head;
15        while(curr!=null){
16            s +=curr.val;
17            curr=curr.next;
18        }
19
20        return Integer.parseInt(s,2);
21
22    }
23}