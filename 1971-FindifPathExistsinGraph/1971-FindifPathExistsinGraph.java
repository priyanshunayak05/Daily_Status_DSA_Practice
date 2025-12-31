// Last updated: 12/31/2025, 10:42:57 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer,List<Integer>>graph=new HashMap<>();
4
5        for(int i=0;i<n;i++){
6            graph.put(i,new ArrayList<>());
7        }
8
9        for(int [] e:edges){
10            graph.get(e[0]).add(e[1]);
11            graph.get(e[1]).add(e[0]);
12        }
13
14        Queue<Integer>q=new LinkedList<>();
15        boolean visited[]=new boolean[n];
16
17        q.add(source);
18        visited[source]=true;
19
20
21        while(!q.isEmpty()){
22            int node=q.poll();
23
24            if(node==destination){
25                return true;
26            }
27
28
29            for(int nbrs:graph.get(node)){
30                if(!visited[nbrs]){
31                    visited[nbrs]=true;
32                    q.add(nbrs);
33                }
34            }
35        }
36
37        return false;
38        
39    }
40}