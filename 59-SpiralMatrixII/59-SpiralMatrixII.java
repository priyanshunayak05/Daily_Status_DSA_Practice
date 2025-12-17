// Last updated: 12/17/2025, 6:14:01 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        
5        int top = 0, bottom = n - 1;
6        int left = 0, right = n - 1;
7        int num = 1;
8        
9        while (top <= bottom && left <= right) {
10            
11            // left → right
12            for (int col = left; col <= right; col++) {
13                matrix[top][col] = num++;
14            }
15            top++;
16            
17            // top → bottom
18            for (int row = top; row <= bottom; row++) {
19                matrix[row][right] = num++;
20            }
21            right--;
22            
23            // right → left
24            if (top <= bottom) {
25                for (int col = right; col >= left; col--) {
26                    matrix[bottom][col] = num++;
27                }
28                bottom--;
29            }
30            
31            // bottom → top
32            if (left <= right) {
33                for (int row = bottom; row >= top; row--) {
34                    matrix[row][left] = num++;
35                }
36                left++;
37            }
38        }
39        
40        return matrix;
41    }
42}
43