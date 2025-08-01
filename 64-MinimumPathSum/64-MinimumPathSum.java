// Last updated: 8/1/2025, 1:58:08 PM
class Solution {
    public int minPathSum(int[][] grid) {
          int m = grid.length;
        int n = grid[0].length;
        
        // DP table to store the minimum path sum for each cell
        int[][] dp = new int[m][n];
        
        // Initialize the top-left corner
        dp[0][0] = grid[0][0];
        
        // Initialize the first row (can only come from the left)
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        
        // Initialize the first column (can only come from above)
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        // The bottom-right corner contains the result
        return dp[m-1][n-1];
    }

    
}
