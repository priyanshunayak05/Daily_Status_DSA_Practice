// Last updated: 12/6/2025, 11:56:57 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    max =Math.max(max,dfs(i,j,grid));
                }
            }
        }
        return max;
        
    }
    public static int dfs(int i,int j,int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return 0;
        }
        int temp=grid[i][j];
        grid[i][j]=0;
        int max1=Math.max((temp+dfs(i,j+1,grid)),(temp+dfs(i,j-1,grid)));
        int max2=Math.max((temp+dfs(i-1,j,grid)),(temp+dfs(i+1,j,grid)));
        int max=Math.max(max1,max2);

        grid[i][j]=temp;

        return max;
    }
}