// Last updated: 1/1/2026, 12:19:23 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n=grid.length;
4        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
5        int [][]dist={{1,0},{-1,0},{0,1},{0,-1},
6            {1,1},{1,-1},{-1,1},{-1,-1}};
7
8            boolean [][]visited=new boolean[n][n];
9            Queue<int[]>q=new LinkedList<>();
10            q.add(new int[]{0,0,1});
11            visited[0][0]=true;
12
13            while(!q.isEmpty()){
14                int []curr=q.poll();
15                int r=curr[0];
16                int c=curr[1];
17                int d=curr[2];
18
19                if(r==n-1 && c==n-1) return d;
20
21                for(int[]nb:dist){
22                    int nr=r+nb[0];
23                    int nc=c+nb[1];
24
25                    if(nr>=0 && nc>=0 && nr<n && nc<n && !visited[nr][nc] && grid[nr][nc]==0){
26                        visited[nr][nc]=true;
27                        q.add(new int[]{nr,nc,d+1});
28                    }
29                }
30
31
32            }
33            return -1;
34
35
36    }
37}