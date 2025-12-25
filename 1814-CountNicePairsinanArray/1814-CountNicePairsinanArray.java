// Last updated: 12/25/2025, 11:59:13 AM
1class Solution {
2    private int rev(int n) {
3        int r = 0;
4        while (n > 0) {
5            r = r * 10 + n % 10;
6            n /= 10;
7        }
8        return r;
9    }
10
11    public int countNicePairs(int[] nums) {
12        final int MOD = 1_000_000_007;
13        Map<Integer, Long> map = new HashMap<>();
14
15        for (int num : nums) {
16            int key = num - rev(num);
17            map.put(key, map.getOrDefault(key, 0L) + 1);
18        }
19
20        long ans = 0;
21        for (long freq : map.values()) {
22            ans = (ans + (freq * (freq - 1) / 2) % MOD) % MOD;
23        }
24
25        return (int) ans;
26    }
27}
28