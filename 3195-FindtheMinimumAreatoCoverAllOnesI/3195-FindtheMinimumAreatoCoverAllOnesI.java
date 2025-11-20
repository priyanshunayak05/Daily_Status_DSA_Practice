// Last updated: 11/20/2025, 2:57:51 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int mr=Integer.MAX_VALUE;
        int mc=Integer.MAX_VALUE;
        int maxr=Integer.MIN_VALUE;
        int maxc=Integer.MIN_VALUE;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mr=Math.min(mr,i);
                    mc=Math.min(mc,j);
                    maxr=Math.max(maxr,i);
                    maxc=Math.max(maxc,j);
                }
            }

            
        }
        return(maxr-mr+1)*(maxc-mc+1);
    }
}