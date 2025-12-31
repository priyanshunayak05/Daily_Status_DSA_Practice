// Last updated: 12/31/2025, 4:05:11 PM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
3        List<List<double[]>>adj=new ArrayList<>();
4        for(int i=0;i<n;i++){
5
6            adj.add(new ArrayList<>());
7
8        }
9        for(int i=0;i<edges.length;i++){
10            int u=edges[i][0];
11            int v=edges[i][1];
12            double p=succProb[i];
13
14            adj.get(u).add(new double[]{v,p});
15            adj.get(v).add(new double[]{u,p});
16
17        }
18        double[]prob=new double[n];
19        prob[start_node]=1.0;
20
21        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
22
23        pq.add(new double[]{1.0,start_node});
24
25        while(!pq.isEmpty()){
26            double[]top=pq.poll();
27            double curr=top[0];
28            int node=(int)top[1];
29
30            if(node == end_node) return curr;
31
32            for(double[]nbrs:adj.get(node)){
33                int next=(int)nbrs[0];
34                double edge_prob=nbrs[1];
35
36                double new_prob=edge_prob*curr;
37
38                if(new_prob>prob[next]){
39                    prob[next]=new_prob;
40                    pq.add(new double[]{new_prob,next});
41                }
42            }
43        }
44
45        return 0.0;
46
47    }
48}