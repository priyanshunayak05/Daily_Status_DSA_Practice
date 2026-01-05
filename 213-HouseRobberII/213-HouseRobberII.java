// Last updated: 1/5/2026, 4:05:35 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n==1)return nums[0];
5        if(n==2)return Math.max(nums[0],nums[1]);
6
7        return Math.max(rober(nums,0,n-2),rober(nums,1,n-1));
8
9        
10    }
11    public static int rober(int[]nums,int start,int end){
12        int n=nums.length;
13        int prev2=nums[start];
14        int prev1=Math.max(nums[start+1],nums[start]);
15
16        for(int i=start+2;i<=end;i++){
17            int curr=Math.max(prev1,nums[i]+prev2);
18            prev2=prev1;
19            prev1=curr;
20        }
21        return prev1;
22    }
23}