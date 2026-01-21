// Last updated: 1/21/2026, 11:52:29 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int xor=0;
4        int n=nums1.length;
5        int m=nums2.length;
6
7        if(n%2!=0){
8            for(int i:nums2){
9                xor ^=i;
10            }
11       }
12
13       if(m%2!=0){
14        for(int i:nums1){
15            xor^=i;
16        }
17       }
18       return xor;
19
20    }
21}