// Last updated: 9/10/2025, 9:24:10 PM
class Solution {
    public int maxUncrossedLines(int[] text1, int[] text2) {
     int [][]dp=new int[text1.length+1][text2.length+1];
        for(int i=1;i<=text1.length;i++){
            for(int j=1;j<=text2.length;j++){
                if(text1[i-1]==text2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length][text2.length];
    }
}