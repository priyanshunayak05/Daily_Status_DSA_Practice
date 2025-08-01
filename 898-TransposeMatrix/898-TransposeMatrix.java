// Last updated: 8/1/2025, 1:55:49 PM
class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        // Create a new matrix with swapped dimensions
        int[][] transposed = new int[n][m];
        
        // Fill in the transposed matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        
        return transposed;
    }
}
