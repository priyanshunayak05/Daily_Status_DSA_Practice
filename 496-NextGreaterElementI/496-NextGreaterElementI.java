// Last updated: 10/23/2025, 11:33:42 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            boolean found = false;  
            int next = -1;          
            
            for (int j = 0; j < n2; j++) {
                
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                // after we find it, check right side for greater element
                if (found && nums2[j] > nums1[i]) {
                    next = nums2[j];
                    break;
                }
            }
            arr[i] = next;
        }
        return arr;
    }
}
