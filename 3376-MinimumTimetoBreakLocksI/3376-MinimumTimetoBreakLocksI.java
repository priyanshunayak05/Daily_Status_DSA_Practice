// Last updated: 12/29/2025, 8:56:14 PM
1class Solution {
2    public int findMinimumTime(List<Integer> strength, int k) {
3        int n = strength.size();
4        int[] arr = new int[n];
5        for (int i = 0; i < n; i++) arr[i] = strength.get(i);
6
7        int maxMask = 1 << n;
8        int[][] dp = new int[maxMask][n + 1];
9
10        for (int i = 0; i < maxMask; i++)
11            java.util.Arrays.fill(dp[i], -1);
12
13        return solve(0, 0, arr, k, dp);
14    }
15
16    private int solve(int mask, int taken, int[] strength, int k, int[][] dp) {
17        int n = strength.length;
18
19        if (taken == n) return 0;
20
21        if (dp[mask][taken] != -1) return dp[mask][taken];
22
23        int x = 1 + taken * k;   // current factor
24        int best = Integer.MAX_VALUE;
25
26        for (int i = 0; i < n; i++) {
27            if ((mask & (1 << i)) == 0) {
28                int need = strength[i];
29                int time = (need + x - 1) / x;   // ceil division
30                best = Math.min(best, time + solve(mask | (1 << i), taken + 1, strength, k, dp));
31            }
32        }
33
34        return dp[mask][taken] = best;
35    }
36}
37