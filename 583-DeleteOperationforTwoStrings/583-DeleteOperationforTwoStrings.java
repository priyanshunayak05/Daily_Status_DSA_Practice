// Last updated: 1/11/2026, 8:47:49 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        // LCS DP
9        for (int i = 1; i <= m; i++) {
10            for (int j = 1; j <= n; j++) {
11                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
12                    dp[i][j] = 1 + dp[i - 1][j - 1];
13                } else {
14                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
15                }
16            }
17        }
18
19        int lcs = dp[m][n];
20        return (m - lcs) + (n - lcs);
21    }
22}
23