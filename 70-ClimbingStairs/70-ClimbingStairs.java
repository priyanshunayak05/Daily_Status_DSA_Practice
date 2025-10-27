// Last updated: 10/27/2025, 11:16:13 PM
class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return climb(n,0,dp);
    }
    public int climb(int n,int idx,int[]dp){
        if(idx>n){
            return 0;
        }
        if(idx==n){

            return 1 ;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int c1=climb(n,idx+1,dp);
        int c2=climb(n,idx+2,dp);

        return dp[idx]=c1+c2;

    }
}