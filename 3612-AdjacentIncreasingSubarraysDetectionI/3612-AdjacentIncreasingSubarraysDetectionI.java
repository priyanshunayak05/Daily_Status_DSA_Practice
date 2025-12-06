// Last updated: 12/6/2025, 11:56:14 PM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int pre = 0, cur = 0, mx = 0;
        for (int i = 0; i < n; i++) {
            cur++;
            if (i == n - 1 || nums.get(i) >= nums.get(i+1)) {
                mx = Math.max(mx, Math.max(cur / 2, Math.min(pre, cur)));
                pre = cur;
                cur = 0;
            }
        }
        return mx >= k;
    }
}