// Last updated: 12/30/2025, 10:28:56 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int len=trust.length;
4        int out[]=new int[n+1];
5        int in[]=new int[n+1];
6
7        for(int i=0;i<len;i++){
8            out[trust[i][0]]++;
9            in[trust[i][1]]++;
10        }
11        //find the judge
12        for(int i=1;i<=n;i++){
13            if(out[i]==0 && in[i]==n-1){
14                return i;
15            }
16        }
17        return -1;
18    }
19}