// Last updated: 11/29/2025, 6:41:29 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4        for( int n:nums){
5            sum +=n;
6        }
7        return sum%k;
8        
9    }
10}