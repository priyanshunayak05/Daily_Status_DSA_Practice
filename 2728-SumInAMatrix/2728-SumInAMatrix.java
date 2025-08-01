// Last updated: 8/1/2025, 1:55:13 PM
class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;

        // Continue until each row in the matrix is empty
        while (true) {
            int maxInRound = 0;
            boolean isEmpty = true;

            // For each row, find and remove the largest element
            for (int i = 0; i < nums.length; i++) {
                int maxInRow = 0;
                int maxIndex = -1;

                // Find the largest element in the row
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] > maxInRow) {
                        maxInRow = nums[i][j];
                        maxIndex = j;
                    }
                }

                // If a max element was found, mark the matrix as not empty
                if (maxIndex != -1) {
                    maxInRound = Math.max(maxInRound, maxInRow);
                    nums[i][maxIndex] = 0; // "Remove" the element by setting it to 0
                    isEmpty = false;
                }
            }

            // If all rows are empty, exit the loop
            if (isEmpty) {
                break;
            }

            // Add the maximum of this round to the score
            score += maxInRound;
        }

        return score;
    }
}
