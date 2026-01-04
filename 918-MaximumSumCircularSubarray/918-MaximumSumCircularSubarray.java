// Last updated: 1/4/2026, 2:21:05 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int curmax=0;
4        int curmin=0;
5        int maxsum=Integer.MIN_VALUE;
6        int minsum=Integer.MAX_VALUE;
7        int total=0;
8        for(int n:nums){
9            total +=n;
10
11            curmax=Math.max(n,curmax+n);
12            maxsum=Math.max(curmax,maxsum);
13
14            curmin=Math.min(n,curmin+n);
15            minsum=Math.min(curmin,minsum);
16
17
18        }
19        if(maxsum<0)return maxsum;
20        return Math.max(maxsum,total-minsum);
21    }
22}