// Last updated: 9/3/2025, 11:35:32 AM
class Solution {
    static int []dp;
    public int rob(int[] nums) {
        dp=new int[nums.length];
         Arrays.fill(dp,-1);
         return rob(nums,0);
    }
    public static int rob(int []nums,int i){
         if(i>=nums.length){
            return 0;
        }
        
       
        if(dp[i] !=-1){
            return dp[i];
        }
    int robber=nums[i]+rob(nums,i+2);
    int skip=rob(nums,i+1);
    return dp[i]=Math.max(robber,skip);
       
     
    }
}