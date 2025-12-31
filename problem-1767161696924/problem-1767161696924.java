// Last updated: 12/31/2025, 11:44:56 AM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>>adj=new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<>());
6
7        }
8        int [] indegree=new int[numCourses];
9        for(int []e:prerequisites){
10            int u=e[0];
11            int v=e[1];
12            adj.get(v).add(u);
13            indegree[u]++;
14        }
15
16
17        Queue<Integer>q=new LinkedList<>();
18        
19        for(int i=0;i<numCourses;i++){
20            if(indegree[i]==0){
21                q.add(i);
22            }
23        }
24        List<Integer>count=new ArrayList<>();
25        while(!q.isEmpty()){
26            int node=q.poll();
27            count.add(node);
28
29            for(int nbrs:adj.get(node)){
30                indegree[nbrs]--;
31                if(indegree[nbrs]==0){
32                    q.add(nbrs);
33                }
34            }
35        }
36        if(count.size()==numCourses){
37            int[] ans = new int[numCourses];
38            for(int i = 0; i < numCourses; i++){
39                ans[i] = count.get(i);
40            }
41            return ans;
42        }
43        return new int[0];
44    }
45}