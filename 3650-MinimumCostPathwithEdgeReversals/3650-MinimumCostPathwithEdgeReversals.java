// Last updated: 12/30/2025, 10:46:56 PM
1class Solution {
2    public int minCost(int n, int[][] edges) {
3
4        List<int[]> graph[] = new ArrayList[n];
5        for(int i = 0; i < n; i++) graph[i] = new ArrayList<>();
6
7        for(int[] e : edges){
8            int u = e[0], v = e[1], w = e[2];
9
10            graph[u].add(new int[]{v, w});     // normal edge
11            graph[v].add(new int[]{u, 2*w});   // reversed edge
12        }
13
14        long[] dist = new long[n];
15        Arrays.fill(dist, Long.MAX_VALUE);
16        dist[0] = 0;
17
18        PriorityQueue<long[]> pq =
19            new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
20        pq.add(new long[]{0,0});
21
22        while(!pq.isEmpty()){
23            long[] cur = pq.poll();
24            long cost = cur[0];
25            int node = (int)cur[1];
26
27            if(cost > dist[node]) continue;
28
29            for(int[] e : graph[node]){
30                int nxt = e[0];
31                long w = e[1];
32
33                if(dist[nxt] > cost + w){
34                    dist[nxt] = cost + w;
35                    pq.add(new long[]{dist[nxt], nxt});
36                }
37            }
38        }
39
40        return dist[n-1] == Long.MAX_VALUE ? -1 : (int)dist[n-1];
41    }
42}
43