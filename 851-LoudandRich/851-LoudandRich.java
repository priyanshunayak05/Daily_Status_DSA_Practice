// Last updated: 9/29/2025, 2:38:53 PM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        
    }
}