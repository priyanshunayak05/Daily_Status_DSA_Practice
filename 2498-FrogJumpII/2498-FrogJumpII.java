// Last updated: 1/6/2026, 3:47:47 PM
1class Solution {
2    public int maxJump(int[] stones) {
3        int n=stones.length;
4        int max=0;
5
6        for(int i=0;i+2<n;i++){
7            max=Math.max(max,Math.abs(stones[i]-stones[i+2]));
8        }
9        // max=Math.max(max,stones[n-1]-stones[n-2]);
10        max=Math.max(max,Math.abs(stones[1]-stones[0]));
11        return max;
12    }
13}