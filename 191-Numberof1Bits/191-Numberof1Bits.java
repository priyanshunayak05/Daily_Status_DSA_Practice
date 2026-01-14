// Last updated: 1/15/2026, 12:05:59 AM
1class Solution {
2    public int hammingWeight(int n) {
3        int c=0;
4        while(n>0){
5            if((n&1)!=0)c++;
6           n= n>>1;
7
8        }
9        return c;
10    }
11}