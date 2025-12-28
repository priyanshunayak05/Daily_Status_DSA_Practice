// Last updated: 12/28/2025, 5:39:25 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int n = nums.length;
4        int ans = Integer.MAX_VALUE;
5
6        for (int i = 0; i < n; i++) {
7            int currentOR = 0;
8            
9            for (int j = i; j < n; j++) {
10                currentOR |= nums[j];   // update OR
11                
12                if (currentOR >= k) {
13                    ans = Math.min(ans, j - i + 1);
14                    break;
15                }
16            }
17        }
18
19        return ans == Integer.MAX_VALUE ? -1 : ans;
20    }
21}
22