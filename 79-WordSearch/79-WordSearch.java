// Last updated: 10/4/2025, 10:00:27 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return search(0,0,m,n,dp);

    }
    public static int search(int i,int j,int m,int n,int[][]dp){
        if(i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        return dp[i][j]=search(i+1,j,m,n,dp)+search(i,j+1,m,n,dp);
       
        
        
    }
}