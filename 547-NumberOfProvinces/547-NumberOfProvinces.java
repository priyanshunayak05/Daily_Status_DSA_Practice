// Last updated: 12/6/2025, 11:58:35 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int prov=0;
        boolean []visited=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                prov++;
            }
        }
        return prov;
    }
    public static void dfs(int [][]isConnected,boolean []visited,int i){
        visited[i]=true;

        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !visited[j]){
                dfs(isConnected,visited,j);
            }
        }
    }
}