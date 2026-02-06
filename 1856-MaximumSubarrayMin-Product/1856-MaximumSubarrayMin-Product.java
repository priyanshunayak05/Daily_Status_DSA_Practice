// Last updated: 2/6/2026, 12:38:08 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int n = nums.length;
4
5        // Step 1: count existing k
6        int baseCount = 0;
7        for (int num : nums) {
8            if (num == k) baseCount++;
9        }
10
11        int maxGain = 0;
12
13        // Step 2: try converting each value v to k
14        for (int v = 1; v <= 50; v++) {
15            if (v == k) continue;
16
17            int curr = 0;
18            int best = 0;
19
20            for (int num : nums) {
21                if (num == v) {
22                    curr += 1;   // we can convert v -> k
23                } else if (num == k) {
24                    curr -= 1;   // k will be spoiled
25                }
26
27                if (curr < 0) curr = 0;
28                best = Math.max(best, curr);
29            }
30
31            maxGain = Math.max(maxGain, best);
32        }
33
34        return baseCount + maxGain;
35    }
36}
37