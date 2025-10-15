// Last updated: 10/15/2025, 9:57:07 PM
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
    int n = nums.size();
    int[] inc = new int[n];
    inc[n - 1] = 1;

    
    for (int i = n - 2; i >= 0; i--) {
        if (nums.get(i) < nums.get(i + 1)) {
            inc[i] = inc[i + 1] + 1;
        } else {
            inc[i] = 1;
        }
    }

    int left = 1, right = n / 2;
    int ans = 0;

   
    while (left <= right) {
        int k = left + (right - left) / 2;
        boolean found = false;

        for (int i = 0; i + 2 * k - 1 < n; i++) {
            if (inc[i] >= k && inc[i + k] >= k) {
                found = true;
                break;
            }
        }

        if (found) {
            ans = k;       
            left = k + 1;  
        } else {
            right = k - 1; 
        }
    }

    return ans;
}
}
