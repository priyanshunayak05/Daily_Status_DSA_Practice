// Last updated: 12/31/2025, 11:19:19 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>>adj=new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<>());
6        }
7        int []indegree=new int[numCourses];
8        for(int[]e:prerequisites){
9            int u=e[0];
10            int v=e[1];
11            adj.get(v).add(u);
12            indegree[u]++;
13        }
14
15        Queue<Integer>q=new LinkedList<>();
16        for(int i=0;i<numCourses;i++){
17            if(indegree[i]==0){
18                q.add(i);
19            }
20        }
21
22        int cycle=0;
23        while(!q.isEmpty()){
24            int node=q.poll();
25            cycle++;
26
27            for(int nbrs:adj.get(node)){
28                indegree[nbrs]--;
29                if(indegree[nbrs]==0){
30                    q.add(nbrs);
31                }
32            }
33        }
34        return cycle==numCourses;
35
36
37    }
38}