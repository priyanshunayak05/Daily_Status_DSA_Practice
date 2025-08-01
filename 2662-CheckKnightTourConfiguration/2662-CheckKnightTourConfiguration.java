// Last updated: 8/1/2025, 1:55:05 PM
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return Print(grid,0,0,0,grid.length);
    }
    public static boolean Print(int[][]grid,int cr,int cc,int exp,int n){
        if(cr<0||cc<0||cr>=n||cc>=n||grid[cr][cc]!=exp){
            return false;
        }
        if(exp==n*n-1){
            return true;
        }
        int [] r={-2,-2,-1,-1,1,1,2,2};
        int [] c={1,-1,-2,2,-2,2,-1,1};
        for(int i=0;i<r.length;i++){
            boolean ans=Print(grid,cr+r[i],cc+c[i],exp+1,n);
            if(ans){
                return true;
            }
        }
        return false;
    }
}