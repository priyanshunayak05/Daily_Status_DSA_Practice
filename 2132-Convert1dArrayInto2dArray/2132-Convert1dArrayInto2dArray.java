// Last updated: 8/1/2025, 1:55:32 PM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length !=m*n){
            return new int[0][0];
        }
        int[][] result=new int[m][n];
        int org=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = original[org]; 
                org++;
        }
       
    }
     return result;
}
}