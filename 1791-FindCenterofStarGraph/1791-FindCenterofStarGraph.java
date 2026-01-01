// Last updated: 1/1/2026, 10:39:46 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int a=edges[0][0];
4        int b=edges[0][1];
5
6        if(edges[1][0]==a || edges[1][1]==a){
7            return a;
8        }
9        return b;
10    }
11}