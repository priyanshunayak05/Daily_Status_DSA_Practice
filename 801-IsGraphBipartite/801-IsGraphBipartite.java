// Last updated: 12/6/2025, 11:58:05 PM
class Solution {
    class BipartitePair{
        int vtx;
        int dis;

        public BipartitePair(int vtx,int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair>q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();

        for(int key=0;key<graph.length;key++){
            if(visited.containsKey(key)){
                continue;
            }
            q.add(new BipartitePair(key,0));
            while(!q.isEmpty()){
                //remove 
                BipartitePair rp=q.poll();

                //ignore
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx)!=rp.dis){
                        return false;
                    }
                    continue;
                }
                //visited
                visited.put(rp.vtx,rp.dis);


                //Add unvisited 
                for(int nbrs:graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,rp.dis +1));
                    }
                }
            }
        }
        return true;
        
    }
}