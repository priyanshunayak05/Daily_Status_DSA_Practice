// Last updated: 12/26/2025, 10:44:04 PM
1import java.util.*;
2
3class Solution {
4    public int minAbsoluteDifference(List<Integer> nums, int x) {
5        if (x == 0) return 0;
6        
7        TreeSet<Integer> set = new TreeSet<>();
8        int ans = Integer.MAX_VALUE;
9
10        for (int i = x; i < nums.size(); i++) {
11            set.add(nums.get(i - x));
12
13            Integer ceil = set.ceiling(nums.get(i));
14            if (ceil != null) ans = Math.min(ans, Math.abs(nums.get(i) - ceil));
15
16            Integer floor = set.floor(nums.get(i));
17            if (floor != null) ans = Math.min(ans, Math.abs(nums.get(i) - floor));
18        }
19
20        return ans;
21    }
22}
23