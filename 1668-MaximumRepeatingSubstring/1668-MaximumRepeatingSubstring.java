// Last updated: 1/4/2026, 3:56:13 PM
1class Solution {
2    static final int MOD = 1000000007;
3
4    public int kConcatenationMaxSum(int[] arr, int k) {
5
6        long total = 0;
7        for (int n : arr) total += n;
8
9        long kadane1 = kadane(arr);
10
11        // k = 1 → only single array matters
12        if (k == 1) return (int)(kadane1 % MOD);
13
14        long kadane2 = kadaneTwo(arr);
15
16        if (total > 0) {
17            long extra = ((total % MOD) * ((k - 2) % MOD)) % MOD;
18            return (int)((kadane2 % MOD + extra) % MOD);
19        }
20
21        return (int)(kadane2 % MOD);
22    }
23
24    static long kadane(int[] arr) {
25        long cur = 0, max = 0;
26        for (int n : arr) {
27            cur = Math.max(0, cur + n);
28            max = Math.max(max, cur);
29        }
30        return max;
31    }
32
33    static long kadaneTwo(int[] arr) {
34        long cur = 0, max = 0;
35        for (int t = 0; t < 2; t++) {
36            for (int n : arr) {
37                cur = Math.max(0, cur + n);
38                max = Math.max(max, cur);
39            }
40        }
41        return max;
42    }
43}
44