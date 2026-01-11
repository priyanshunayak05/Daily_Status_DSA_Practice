// Last updated: 1/11/2026, 8:54:41 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5
6        int[][]dp=new int[n+1][m+1];
7
8        for(int i=0;i<=n;i++)dp[i][0]=i;
9        for(int j=0;j<=m;j++)dp[0][j]=j;
10
11        for(int i=1;i<=n;i++){
12            for(int j=1;j<=m;j++){
13                if(word1.charAt(i-1)==word2.charAt(j-1)){
14                    dp[i][j]=dp[i-1][j-1];
15                }
16                else{
17                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
18                }
19            }
20        }
21        return dp[n][m];
22    }
23}