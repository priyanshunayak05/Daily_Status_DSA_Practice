// Last updated: 9/10/2025, 12:38:10 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
       int ans=Integer.MAX_VALUE;
        int[][] dp=new int[grid.length][grid.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-10001);
        }
        for(int col=0;col<grid[0].length;col++){
            ans=Math.min(ans,MinPath(grid,0,col,dp));
        }
        return ans;
    }
    public int MinPath(int[][] matrix,int cr,int cc,int[][] dp){
        if(cr==matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!=-10001) return dp[cr][cc]; 
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            if(i==cc) continue;
            ans=Math.min(ans,MinPath(matrix,cr+1,i,dp));
        }
        return dp[cr][cc]=ans+matrix[cr][cc];
    }
}