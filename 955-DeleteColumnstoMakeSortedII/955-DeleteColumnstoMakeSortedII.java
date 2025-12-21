// Last updated: 12/21/2025, 8:13:57 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        boolean[] sorted = new boolean[n - 1];
6        int deletions = 0;
7
8        for (int col = 0; col < m; col++) {
9            boolean needDelete = false;
10
11            for (int row = 0; row < n - 1; row++) {
12                if (!sorted[row] && 
13                    strs[row].charAt(col) > strs[row + 1].charAt(col)) {
14                    needDelete = true;
15                    break;
16                }
17            }
18
19            if (needDelete) {
20                deletions++;
21            } else {
22                for (int row = 0; row < n - 1; row++) {
23                    if (!sorted[row] && 
24                        strs[row].charAt(col) < strs[row + 1].charAt(col)) {
25                        sorted[row] = true;
26                    }
27                }
28            }
29        }
30        return deletions;
31    }
32}
33