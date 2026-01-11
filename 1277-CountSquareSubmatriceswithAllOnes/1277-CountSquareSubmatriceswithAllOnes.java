// Last updated: 1/11/2026, 5:34:31 PM
1class Solution {
2    public int countSquares(int[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5
6        int[][]dp=new int[n][m];
7        int count=0;
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                if(matrix[i][j]==1){
11                    if(i==0 ||j==0){
12                        dp[i][j]=1;
13                    }else{
14                        dp[i][j]=1+(Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])));
15                    }
16                }
17                count +=dp[i][j];
18            }
19        }
20        return count;
21        
22    }
23}