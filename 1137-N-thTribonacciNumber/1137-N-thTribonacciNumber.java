// Last updated: 1/6/2026, 10:30:42 PM
1class Solution {
2    public int minimumJumps(int[] forbidden, int a, int b, int x) {
3        Set<Integer> block = new HashSet<>();
4        for (int f : forbidden) block.add(f);
5
6        int limit = 6000; // Safe upper bound
7        
8        boolean[][] visited = new boolean[limit + 1][2];
9        // visited[pos][0] => came by forward
10        // visited[pos][1] => came by backward
11
12        Queue<int[]> q = new LinkedList<>();
13        q.offer(new int[]{0, 0});  // {position, lastWasBack? 0/1}
14        visited[0][0] = true;
15
16        int steps = 0;
17
18        while (!q.isEmpty()) {
19            int size = q.size();
20            while (size-- > 0) {
21                int[] cur = q.poll();
22                int pos = cur[0];
23                int back = cur[1];
24
25                if (pos == x) return steps;
26
27                // ---- Forward Jump ----
28                int forward = pos + a;
29                if (forward <= limit && !block.contains(forward) && !visited[forward][0]) {
30                    visited[forward][0] = true;
31                    q.offer(new int[]{forward, 0});
32                }
33
34                // ---- Backward Jump ----
35                int backward = pos - b;
36                if (back == 0 && backward >= 0 && !block.contains(backward) && !visited[backward][1]) {
37                    visited[backward][1] = true;
38                    q.offer(new int[]{backward, 1});
39                }
40            }
41            steps++;
42        }
43
44        return -1;
45    }
46}
47