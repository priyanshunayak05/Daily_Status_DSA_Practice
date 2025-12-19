// Last updated: 12/19/2025, 6:06:27 PM
1import java.util.HashMap;
2
3class Solution {
4    public int findLHS(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        
7        // Count frequency of each number
8        for (int num : nums) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11        
12        int maxLen = 0;
13        
14        // Check harmonious pairs
15        for (int key : map.keySet()) {
16            if (map.containsKey(key + 1)) {
17                maxLen = Math.max(
18                    maxLen,
19                    map.get(key) + map.get(key + 1)
20                );
21            }
22        }
23        
24        return maxLen;
25    }
26}
27