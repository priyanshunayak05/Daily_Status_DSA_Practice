// Last updated: 2/2/2026, 2:29:23 PM
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
11import java.math.BigInteger;
12
13class Solution {
14    public ListNode doubleIt(ListNode head) {
15
16        // Step 1: Linked List to String
17        StringBuilder sb = new StringBuilder();
18        ListNode curr = head;
19
20        while (curr != null) {
21            sb.append(curr.val);
22            curr = curr.next;
23        }
24
25        // Step 2: String to BigInteger
26        BigInteger num = new BigInteger(sb.toString());
27
28        // Step 3: Multiply by 2
29        num = num.multiply(BigInteger.valueOf(2));
30
31        // Step 4: Convert result to String
32        String res = num.toString();
33
34        // Step 5: Convert back to Linked List
35        ListNode dummy = new ListNode(0);
36        curr = dummy;
37
38        for (int i = 0; i < res.length(); i++) {
39            curr.next = new ListNode(res.charAt(i) - '0');
40            curr = curr.next;
41        }
42
43        return dummy.next;
44    }
45}
46