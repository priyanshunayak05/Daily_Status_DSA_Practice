// Last updated: 1/21/2026, 12:11:15 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int n=arr1.length;
4        int m=arr2.length;
5        int xor=0;
6        int xor2=0;
7        for(int i:arr1){
8            xor ^=i;
9        }
10
11        for(int i:arr2){
12            xor2 ^=i;
13        }
14
15        return xor & xor2;
16        
17    }
18}