// Last updated: 11/5/2025, 11:41:17 PM
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
    public ListNode sortList(ListNode head) {
        ListNode dummy=head;
        ArrayList<Integer>list=new ArrayList<>();

        while(dummy!=null){
            list.add(dummy.val);
            dummy=dummy.next;
        }

        Collections.sort(list);
        dummy=head;
        int i=0;
        while(dummy!=null){
            dummy.val=list.get(i);
            i++;
            dummy=dummy.next;
        }

        return head;

        
    }
}