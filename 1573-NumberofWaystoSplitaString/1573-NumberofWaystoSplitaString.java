// Last updated: 12/22/2025, 8:12:53 PM
1class Solution {
2    public int numWays(String s) {
3        int MOD = 1_000_000_007;
4        int n = s.length();
5        int totalOnes = 0;
6        for (char c : s.toCharArray()) {
7            if (c == '1') totalOnes++;
8        }
9        if (totalOnes % 3 != 0) return 0;
10        if (totalOnes == 0) {
11            long ways = (long)(n - 1) * (n - 2) / 2;
12            return (int)(ways % MOD);
13        }
14        int k = totalOnes / 3;
15        int onesCount = 0;
16        long zeros1 = 0, zeros2 = 0;
17        for (int i = 0; i < n; i++) {
18            if (s.charAt(i) == '1') {
19                onesCount++;
20            } else {
21                if (onesCount == k) zeros1++;
22                else if (onesCount == 2 * k) zeros2++;
23            }
24        }
25        long result = (zeros1 + 1) * (zeros2 + 1);
26        return (int)(result % MOD);
27    }
28}
29