// Last updated: 12/31/2025, 3:04:55 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        List<List<Integer>>adj=new ArrayList<>();
4        int n =edges.length;
5        int []dis1=new int[n];
6        int[]dis2=new int[n];
7        Arrays.fill(dis1,-1);
8        Arrays.fill(dis2,-1);
9
10        dfs(edges,dis1,node1);
11        dfs(edges,dis2,node2);
12
13        int ans=-1;
14        int mindis=Integer.MAX_VALUE;
15
16        for(int i=0;i< n;i++){
17            if(dis1[i]!=-1 && dis2[i]!=-1){
18                int maxdis=Math.max(dis1[i],dis2[i]);
19                if(maxdis<mindis){
20                    mindis=maxdis;
21                    ans=i;
22                }
23            }
24        }
25        return ans;
26    }
27    public void dfs(int [] edges,int []dis,int start){
28        int d=0;
29        int curr=start;
30        while(curr !=-1 && dis[curr]==-1){
31            dis[curr]=d++;
32            curr=edges[curr];
33        }
34    }
35
36}