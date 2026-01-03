// Last updated: 1/3/2026, 12:09:03 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        List<List<Integer>>adj=new ArrayList<>();
4        for(int i=0;i<n;i++){
5            adj.add(new ArrayList<>());
6        }
7        int []indegree=new int[n];
8        for(int []e:edges){
9            int u=e[0];
10            int v=e[1];
11            adj.get(u).add(v);
12            indegree[v]++;
13        }
14
15        Queue<Integer>q=new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(indegree[i]==0){
18                q.add(i);
19            }
20        }
21
22        int a=q.size();
23
24        if(a >1){
25            return -1;
26        }
27        return q.poll();
28        
29    }
30}