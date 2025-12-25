// Last updated: 12/25/2025, 11:58:17 AM
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        List<Integer>[] buckets = new ArrayList[101];
4
5        for (int i = 1; i <= 100; i++)
6            buckets[i] = new ArrayList<>();
7
8        // Group rectangle lengths by height
9        for (int[] r : rectangles) {
10            buckets[r[1]].add(r[0]);
11        }
12
13        // Sort each bucket
14        for (int i = 1; i <= 100; i++)
15            Collections.sort(buckets[i]);
16
17        int[] ans = new int[points.length];
18
19        for (int i = 0; i < points.length; i++) {
20            int x = points[i][0];
21            int y = points[i][1];
22            int count = 0;
23
24            // Only heights >= y are useful
25            for (int h = y; h <= 100; h++) {
26                List<Integer> list = buckets[h];
27                if (list.isEmpty()) continue;
28
29                int idx = lowerBound(list, x);
30                count += list.size() - idx;
31            }
32
33            ans[i] = count;
34        }
35
36        return ans;
37    }
38
39    private int lowerBound(List<Integer> list, int target) {
40        int left = 0, right = list.size();
41        while (left < right) {
42            int mid = (left + right) / 2;
43            if (list.get(mid) >= target)
44                right = mid;
45            else
46                left = mid + 1;
47        }
48        return left;
49    }
50}
51