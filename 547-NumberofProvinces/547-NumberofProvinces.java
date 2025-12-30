// Last updated: 12/30/2025, 10:31:21 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n=isConnected.length;
4        int prov=0;
5        boolean []visited=new boolean[n];
6
7        for(int i=0;i<n;i++){
8            if(!visited[i]){
9                dfs(isConnected,visited,i);
10                prov++;
11            }
12        }
13        return prov;
14    }
15    public static void dfs(int [][]isConnected,boolean []visited,int i){
16        visited[i]=true;
17
18        for(int j=0;j<isConnected.length;j++){
19            if(isConnected[i][j]==1 && !visited[j]){
20                dfs(isConnected,visited,j);
21            }
22        }
23    }
24}