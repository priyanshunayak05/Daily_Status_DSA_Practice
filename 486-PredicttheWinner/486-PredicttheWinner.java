// Last updated: 10/5/2025, 8:16:42 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][n];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        return maxdiff(nums,0,n-1,dp)>=0;
    }
    public static int maxdiff(int[]nums,int left,int right,int[][]dp){
        int n=nums.length;

        if(left==right){
            return nums[right];
        }
        if(dp[left][right]!=-1){
            return dp[left][right];
        }

        int player1=nums[left] -maxdiff(nums,left+1,right,dp);
        int player2=nums[right]-maxdiff(nums,left,right-1,dp);

        return dp[left][right]=Math.max(player1,player2);
    }
} 