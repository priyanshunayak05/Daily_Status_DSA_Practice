// Last updated: 9/10/2025, 9:24:42 PM
class Solution {
    public int change(int amount, int[] coins) {
        int [][]dp=new int[coins.length+1][amount+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<dp.length;i++){ //coins
            for(int am=1;am<dp[0].length;am++){ //amount
                int inc=0,exc=0;
                if(am>=coins[i-1]){
                    inc=dp[i][am-coins[i-1]];
                }
                exc=dp[i-1][am];
                dp[i][am]=inc+exc;
            }

        }
        return dp[dp.length-1][dp[0].length-1];
    }

}