// Last updated: 1/13/2026, 12:27:16 PM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5
6        int[][]dp=new int[n][m];
7        int max=0;
8
9        for(int i=0;i<n;i++){
10            for(int j=0;j<m;j++){
11                if(matrix[i][j]=='1'){
12                    if(i==0 || j==0){
13                        dp[i][j]=1;
14                    }
15                    else{
16                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
17                    }
18
19                    max=Math.max(max,dp[i][j]);
20                }
21            }
22        }
23
24        return max*max;
25        
26    }
27}