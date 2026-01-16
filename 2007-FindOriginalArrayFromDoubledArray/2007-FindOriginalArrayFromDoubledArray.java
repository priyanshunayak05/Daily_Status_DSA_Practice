// Last updated: 1/17/2026, 12:16:00 AM
1import java.util.*;
2
3class Solution {
4    public int[] findOriginalArray(int[] changed) {
5        int n = changed.length;
6
7        // If length is odd, cannot form original array
8        if (n % 2 != 0) return new int[0];
9
10        Arrays.sort(changed);
11
12        // Frequency map
13        Map<Integer, Integer> freq = new HashMap<>();
14        for (int num : changed) {
15            freq.put(num, freq.getOrDefault(num, 0) + 1);
16        }
17
18        int[] original = new int[n / 2];
19        int index = 0;
20
21        for (int num : changed) {
22            // Skip if already used
23            if (freq.get(num) == 0) continue;
24
25            // Special case for zero
26            if (num == 0) {
27                if (freq.get(0) < 2) return new int[0];
28                original[index++] = 0;
29                freq.put(0, freq.get(0) - 2);
30            } 
31            // Normal case
32            else {
33                int doubled = num * 2;
34                if (!freq.containsKey(doubled) || freq.get(doubled) == 0) {
35                    return new int[0];
36                }
37                original[index++] = num;
38                freq.put(num, freq.get(num) - 1);
39                freq.put(doubled, freq.get(doubled) - 1);
40            }
41        }
42
43        return original;
44    }
45}
46