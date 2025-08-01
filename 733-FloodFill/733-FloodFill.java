// Last updated: 8/1/2025, 1:56:02 PM
class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // If the original color is the same as the target color, no change is needed.
        if (originalColor == color) {
            return image;
        }
        
        // Start the flood fill using DFS.
        dfs(image, sr, sc, originalColor, color);
        
        return image;
    }
    
    private void dfs(int[][] image, int row, int col, int originalColor, int newColor) {
        // Check for out-of-bound indices or if the current pixel is not of the original color.
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != originalColor) {
            return;
        }
        
        // Change the color of the current pixel.
        image[row][col] = newColor;
        
        // Perform DFS in all four directions.
        dfs(image, row + 1, col, originalColor, newColor); // down
        dfs(image, row - 1, col, originalColor, newColor); // up
        dfs(image, row, col + 1, originalColor, newColor); // right
        dfs(image, row, col - 1, originalColor, newColor); // left
    }
}
