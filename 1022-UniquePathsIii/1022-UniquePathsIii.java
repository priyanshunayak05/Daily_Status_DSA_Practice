// Last updated: 12/6/2025, 11:57:48 PM
class Solution {
    int empty=1;
    int totalpath=0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int srow=0;
        int scol=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    srow=i;
                    scol=j;
                }
                else if(grid[i][j]==0){
                    empty++;
                }
            }
        }

        search(grid,srow,scol,m,n);
        return totalpath;
    }
    public void search(int[][]grid,int i,int j,int m,int n){
        if(i<0 || j < 0 || i>=m || j>=n || grid[i][j]==-1){
            return;
        }
        
        if(grid[i][j]==2){
            if (empty==0){
                totalpath++;
            }
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        empty--;

        search(grid,i+1,j,m,n);
        search(grid,i,j+1,m,n);
        search(grid,i,j-1,m,n);
        search(grid,i-1,j,m,n);

        grid[i][j]=temp;
        empty++;
    }
}