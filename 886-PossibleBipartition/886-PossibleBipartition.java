// Last updated: 1/3/2026, 4:14:11 PM
1class Solution {
2    List<List<Integer>> adj;
3    int[] timeBob;
4    int ans = Integer.MIN_VALUE;
5
6    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
7        int n = amount.length;
8
9        adj = new ArrayList<>();
10        for(int i = 0; i < n; i++){
11            adj.add(new ArrayList<>());
12        }
13
14        for(int[] e : edges){
15            adj.get(e[0]).add(e[1]);
16            adj.get(e[1]).add(e[0]);
17        }
18
19        // ---------- STEP 1 : Find parent using BFS ----------
20        int[] parent = new int[n];
21        Arrays.fill(parent, -1);
22
23        Queue<Integer> q = new LinkedList<>();
24        q.add(0);
25        parent[0] = 0;
26
27        while(!q.isEmpty()){
28            int node = q.poll();
29
30            for(int nbr : adj.get(node)){
31                if(parent[nbr] == -1){
32                    parent[nbr] = node;
33                    q.add(nbr);
34                }
35            }
36        }
37
38        // ---------- STEP 2 : Compute Bob times ----------
39        timeBob = new int[n];
40        Arrays.fill(timeBob, Integer.MAX_VALUE);
41
42        int t = 0;
43        int curr = bob;
44
45        while(curr != 0){
46            timeBob[curr] = t;
47            curr = parent[curr];
48            t++;
49        }
50        timeBob[0] = t;
51
52        // ---------- STEP 3 : DFS for Alice ----------
53        dfs(0, -1, 0, 0, amount);
54
55        return ans;
56    }
57
58    void dfs(int node, int parent, int timeAlice, int income, int[] amount){
59
60        if(timeAlice < timeBob[node])
61            income += amount[node];
62        else if(timeAlice == timeBob[node])
63            income += amount[node] / 2;
64
65        // leaf check
66        if(adj.get(node).size() == 1 && node != 0){
67            ans = Math.max(ans, income);
68            return;
69        }
70
71        for(int nbr : adj.get(node)){
72            if(nbr == parent) continue;
73            dfs(nbr, node, timeAlice + 1, income, amount);
74        }
75    }
76}
77