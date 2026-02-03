// Last updated: 2/3/2026, 12:02:28 PM
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
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer>ls=new ArrayList<>();
14        ListNode curr=head;
15        while(curr!=null){
16            ls.add(curr.val);
17            curr=curr.next;
18        }
19
20        Stack<Integer>st=new Stack<>();
21        int res[]=new int[ls.size()];
22
23        for(int i=ls.size()-1;i>=0;i--){
24            while(!st.isEmpty() && st.peek()<=ls.get(i)){
25                st.pop();
26            }
27            res[i]=st.isEmpty()?0:st.peek();
28            st.push(ls.get(i));
29        }
30        return res;
31        
32    }
33}