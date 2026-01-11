// Last updated: 1/11/2026, 3:30:04 PM
1class Solution {
2    boolean [][]visited;
3    int n;
4    int m;
5    int ans;
6    int[][]distance={{1,0}, {-1,0}, {0,1}, {0,-1}};
7    public int minimumEffortPath(int[][] heights) {
8        n=heights.length;
9        m=heights[0].length;
10
11        int low=0;
12        int high=1000000;
13        ans=high;
14
15        
16
17        while(low<=high){
18            int mid=low+(high-low)/2;
19            visited=new boolean[n][m];
20
21            if(dfs(heights,0,0,mid)){
22                ans=mid;
23                high=mid-1;
24            }
25            else{
26                low=mid+1;
27            }
28        }
29        return ans;
30
31
32        
33    }
34    public boolean dfs(int[][]heights,int r,int c,int e){
35        //base case
36        if(r==n-1 && c==m-1){
37            return true;
38        }
39        visited[r][c]=true;
40        for(int[]d:distance){
41            int nr=r+d[0];
42            int nc=c+d[1];
43
44            if(nr>=0 && nc>=0 && nr<n && nc<m && !visited[nr][nc]){
45                int diff=Math.abs(heights[r][c]-heights[nr][nc]);
46                    if(diff<=e){
47                       if( dfs(heights,nr,nc,e)) return true;
48                    }
49                }
50            }
51            return false;
52        }
53}