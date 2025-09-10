// Last updated: 9/10/2025, 9:24:30 PM
class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,0),mincost(cost,1));
    }
    public int mincost(int []cost,int idx){
        
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx] + Math.min(mincost(cost,idx+1),mincost(cost,idx+2));
    }
}