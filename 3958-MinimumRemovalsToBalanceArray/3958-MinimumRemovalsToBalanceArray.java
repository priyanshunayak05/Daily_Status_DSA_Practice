// Last updated: 8/14/2025, 11:16:56 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
       int n = nums.length;
        Arrays.sort(nums);
        
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            long target = (long) nums[i] * k; 
            int left = i, right = n - 1, validJ = i - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] <= target) {
                    validJ = mid; 
                    left = mid + 1; 
                } else {
                    right = mid - 1;
                }
            }
            
           
            int currentLength = validJ - i + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        
       
        return n - maxLength;
    }
}