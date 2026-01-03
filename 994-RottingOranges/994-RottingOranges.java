// Last updated: 1/4/2026, 1:01:05 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int ans=0;
6
7        Queue<int[]>q=new LinkedList<>();
8        boolean [][]vis=new boolean[n][m];
9
10        for(int i=0;i<n;i++){
11            for(int j=0;j<m;j++){
12                if(grid[i][j]==2){
13                    q.add(new int[]{i,j,0});
14                    vis[i][j]=true;
15                }
16            }
17        }
18        while(!q.isEmpty()){
19            int []curr=q.poll();
20            int i=curr[0];
21            int j=curr[1];
22            int t=curr[2];
23            ans=Math.max(ans,t);
24            if(i-1 >=0 && !vis[i-1][j] && grid[i-1][j]==1){
25                q.add(new int[]{i-1,j,t+1});
26                vis[i-1][j]=true;
27            }
28            if(i+1 <n && !vis[i+1][j] && grid[i+1][j]==1){
29                q.add(new int[]{i+1,j,t+1});
30                vis[i+1][j]=true;
31            }
32            if(j-1 >=0 && !vis[i][j-1] && grid[i][j-1]==1){
33                q.add(new int[]{i,j-1,t+1});
34                vis[i][j-1]=true;
35            }
36            if(j+1 <m && !vis[i][j+1] && grid[i][j+1]==1){
37                q.add(new int[]{i,j+1,t+1});
38                vis[i][j+1]=true;
39            }
40        }
41        for(int i=0;i<n;i++){
42            for(int j=0;j<m;j++){
43                if(grid[i][j]==1 && !vis[i][j]){
44                    return -1;
45                }
46            }
47        }
48        return ans;
49        
50
51    }
52}