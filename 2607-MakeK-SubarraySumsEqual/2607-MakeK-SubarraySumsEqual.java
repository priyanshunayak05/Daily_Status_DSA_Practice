// Last updated: 12/25/2025, 11:56:29 AM
1class Solution {
2    public long makeSubKSumEqual(int[] arr, int k) {
3        int n = arr.length;
4        int g = gcd(n, k);
5        long operations = 0;
6
7        boolean[] visited = new boolean[n];
8
9        for (int i = 0; i < n; i++) {
10            if (visited[i]) continue;
11
12            List<Integer> group = new ArrayList<>();
13            int j = i;
14
15            while (!visited[j]) {
16                visited[j] = true;
17                group.add(arr[j]);
18                j = (j + k) % n;
19            }
20
21            Collections.sort(group);
22            int m = group.size();
23            long median = group.get(m / 2);
24
25            for (long val : group) {
26                operations += Math.abs(val - median);
27            }
28        }
29
30        return operations;
31    }
32
33    private int gcd(int a, int b) {
34        return b == 0 ? a : gcd(b, a % b);
35    }
36}
37