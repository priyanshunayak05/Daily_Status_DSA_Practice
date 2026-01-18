// Last updated: 1/18/2026, 3:18:32 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n=nums.length;
4        int i=1;
5  
6        int c=0;
7        while(i<n){
8            if(nums[i]<=nums[i-1]){
9                int diff=nums[i-1]-nums[i];
10                nums[i] +=diff+1;
11                c +=diff+1;
12                i++;
13            }
14            else{
15                i++;
16            }
17        }
18        return c;
19    }
20}