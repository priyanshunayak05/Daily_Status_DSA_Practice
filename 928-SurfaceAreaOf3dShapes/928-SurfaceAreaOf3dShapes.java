// Last updated: 8/1/2025, 1:55:43 PM
class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int surfaceArea = 0;

        // Iterate over each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                if (v > 0) {
                    // Top and bottom face
                    surfaceArea += 2;

                    // Left
                    if (j == 0) {
                        surfaceArea += v;
                    } else {
                        surfaceArea += Math.max(v - grid[i][j - 1], 0);
                    }

                    // Right
                    if (j == n - 1) {
                        surfaceArea += v;
                    } else {
                        surfaceArea += Math.max(v - grid[i][j + 1], 0);
                    }

                    // Up
                    if (i == 0) {
                        surfaceArea += v;
                    } else {
                        surfaceArea += Math.max(v - grid[i - 1][j], 0);
                    }

                    // Down
                    if (i == n - 1) {
                        surfaceArea += v;
                    } else {
                        surfaceArea += Math.max(v - grid[i + 1][j], 0);
                    }
                }
            }
        }

        return surfaceArea;
    }
}
