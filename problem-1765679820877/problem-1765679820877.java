// Last updated: 12/14/2025, 8:07:00 AM
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        long small=0, large=0;
4        Arrays.sort(nums);
5        int n=nums.length;
6
7        for(int i=0;i<k;i++){
8            small +=nums[i];
9        }
10        for(int i=n-k;i<n;i++){
11            large +=nums[i];
12        }
13        int diff=(int)Math.abs(large-small);
14        return diff;
15
16        
17    }
18}