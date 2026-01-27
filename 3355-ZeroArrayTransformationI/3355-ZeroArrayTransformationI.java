// Last updated: 1/27/2026, 2:51:10 PM
1class Solution {
2    public boolean isZeroArray(int[] nums, int[][] queries) {
3        int n=nums.length;
4        int[]diff=new int[n+1];
5        for(int i = 0; i < queries.length; i++){
6
7            int l = queries[i][0];
8            int r = queries[i][1];
9
10            diff[l] +=1;
11            if(r+1 <n){
12                diff[r+1] -=1;
13            }
14
15        }
16
17        int cum=0;
18        for(int i=0;i<n;i++){
19            cum +=diff[i];
20
21            if(nums[i]>cum)return false;
22        }
23
24        return true;
25    }
26}