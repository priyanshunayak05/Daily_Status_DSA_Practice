// Last updated: 12/19/2025, 6:18:21 PM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        HashMap<Integer, Integer> need = new HashMap<>();
5
6        for (int num : nums) {
7            freq.put(num, freq.getOrDefault(num, 0) + 1);
8        }
9
10        for (int num : nums) {
11            if (freq.get(num) == 0) continue;
12
13            if (need.getOrDefault(num, 0) > 0) {
14                need.put(num, need.get(num) - 1);
15                need.put(num + 1, need.getOrDefault(num + 1, 0) + 1);
16            }
17            else if (freq.getOrDefault(num + 1, 0) > 0 &&
18                     freq.getOrDefault(num + 2, 0) > 0) {
19                freq.put(num + 1, freq.get(num + 1) - 1);
20                freq.put(num + 2, freq.get(num + 2) - 1);
21                need.put(num + 3, need.getOrDefault(num + 3, 0) + 1);
22            }
23            else {
24                return false;
25            }
26
27            freq.put(num, freq.get(num) - 1);
28        }
29
30        return true;
31    }
32}
33