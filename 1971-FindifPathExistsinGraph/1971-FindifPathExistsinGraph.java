// Last updated: 11/22/2025, 9:11:22 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>>graph=new HashMap<>();

        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }

        for(int [] e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        Queue<Integer>q=new LinkedList<>();
        boolean visited[]=new boolean[n];

        q.add(source);
        visited[source]=true;


        while(!q.isEmpty()){
            int node=q.poll();

            if(node==destination){
                return true;
            }


            for(int nbrs:graph.get(node)){
                if(!visited[nbrs]){
                    visited[nbrs]=true;
                    q.add(nbrs);
                }
            }
        }

        return false;
        
    }
}