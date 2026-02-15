// Last updated: 2/15/2026, 3:41:08 PM
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
12    public ListNode middleNode(ListNode head) {
13        int size=0;
14        ListNode curr=head;
15        while(curr!=null){
16            size++;
17            curr=curr.next;
18        }
19        ListNode temp=head;
20        if(size%2==0){
21            int n=size/2;
22            for(int i=0;i<n;i++){
23                temp=temp.next;
24            }
25        }
26        else{
27            int n=size/2;
28            for(int i=0;i<n;i++){
29                temp=temp.next;
30            }
31        }
32        return temp;
33
34
35        
36    }
37}