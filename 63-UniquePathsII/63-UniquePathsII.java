// Last updated: 10/6/2025, 10:57:08 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]dp=new int[m][n];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return search(obstacleGrid,0,0,dp);
        
    }
    public static int search(int[][]obstacleGrid,int i,int j,int[][]dp){
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(i>=m || j>=n || obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right=search(obstacleGrid,i+1,j,dp);
        int down=search(obstacleGrid,i,j+1,dp);

        return dp[i][j]= right+down;
    }
}