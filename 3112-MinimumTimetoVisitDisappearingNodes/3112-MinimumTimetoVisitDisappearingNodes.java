// Last updated: 1/2/2026, 11:54:00 AM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>>adj=new ArrayList<>();
4
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        for(int e[]:edges){
9            int u=e[0];
10            int v=e[1];
11            int l=e[2];
12
13
14            adj.get(u).add(new int[]{v,l});
15            adj.get(v).add(new int[]{u,l});
16        }
17
18        int[]dist=new int[n];
19        Arrays.fill(dist,Integer.MAX_VALUE);
20        dist[0]=0;
21
22       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
23        pq.add(new int[]{0,0});
24
25        while(!pq.isEmpty()){
26
27            int[]curr=pq.poll();
28            int node=curr[0];
29            int current_time=curr[1];
30
31            if(current_time >dist[node])continue;
32            if(current_time >=disappear[node]){
33                continue;
34            }
35
36            for(int[]nbrs:adj.get(node)){
37            int next=nbrs[0];
38            int edge_time=nbrs[1];
39            int new_time=current_time+edge_time;
40
41            if(new_time<dist[next] && new_time<disappear[next]){
42                dist[next]=new_time;
43                pq.add(new int[]{next,new_time});
44            }
45            }
46
47
48        }
49        for(int i=0;i<n;i++){
50            if(dist[i]==Integer.MAX_VALUE){
51                dist[i]=-1;
52            }
53        }
54        return dist;
55    }
56}