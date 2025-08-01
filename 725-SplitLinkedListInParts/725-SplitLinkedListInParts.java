// Last updated: 8/1/2025, 1:56:04 PM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode current=head;
        int l=0;
        while(current!=null){
            l++;
            current=current.next;
        }
        int eachnode=l/k;
        int remain=l%k;
         ListNode[] result = new ListNode[k];
        current=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ListNode partHead=current;
            int partsize=eachnode+(remain >0?1:0);
            for(int c=0;c<partsize-1;c++){
                if(current!=null){
                    current=current.next;
                }
                
                
            }
             if (current != null) {
                ListNode nextPart = current.next;
                current.next = null; // break link
                current = nextPart;
            }
             result[i] = partHead;
            if (remain > 0) remain--;
        }


        return result;
        
    }
}