// Last updated: 12/29/2025, 3:11:30 PM
1import java.util.*;
2
3class Solution {
4    public int orangesRotting(int[][] grid) {
5        Queue<int[]> q = new LinkedList<>();
6        int fresh = 0;
7
8        // Step 1: collect rotten oranges & count fresh
9        for (int i = 0; i < grid.length; i++) {
10            for (int j = 0; j < grid[0].length; j++) {
11                if (grid[i][j] == 2) q.offer(new int[]{i, j});
12                if (grid[i][j] == 1) fresh++;
13            }
14        }
15
16        int minutes = 0;
17        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
18
19        // Step 2: BFS
20        while (!q.isEmpty() && fresh > 0) {
21            int size = q.size();
22            minutes++;
23
24            for (int i = 0; i < size; i++) {
25                int[] cell = q.poll();
26
27                for (int[] d : dirs) {
28                    int r = cell[0] + d[0];
29                    int c = cell[1] + d[1];
30
31                    if (r >= 0 && r < grid.length &&
32                        c >= 0 && c < grid[0].length &&
33                        grid[r][c] == 1) {
34
35                        grid[r][c] = 2;
36                        fresh--;
37                        q.offer(new int[]{r, c});
38                    }
39                }
40            }
41        }
42
43        return fresh == 0 ? minutes : -1;
44    }
45}
46