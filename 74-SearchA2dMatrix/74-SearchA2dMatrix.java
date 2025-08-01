// Last updated: 8/1/2025, 1:58:04 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean a=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    a=true;
                    break;
                }
            }
        }
        return a;
    }
}