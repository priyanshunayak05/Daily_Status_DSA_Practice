// Last updated: 8/28/2025, 12:08:57 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class verticalPair{
        TreeNode node;
        int l;
        int v;
        verticalPair(TreeNode node,int l,int v){
            this.l=l;
            this.v=v;
            this.node=node;
        }  
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<verticalPair> q=new LinkedList<>();
        TreeMap<Integer,List<verticalPair>> map=new TreeMap<>();
        q.add(new verticalPair(root,0,0));
        while(!q.isEmpty()){
            verticalPair vp=q.poll();
            if(!map.containsKey(vp.v)){
                map.put(vp.v,new ArrayList<>());
            }
            map.get(vp.v).add(vp);
            if(vp.node.left!=null){
                q.add(new verticalPair(vp.node.left,vp.l+1,vp.v-1));
            }
            if(vp.node.right!=null){
                q.add(new verticalPair(vp.node.right,vp.l+1,vp.v+1));
            }
        }
        List<List<Integer>> ans =new ArrayList<>();
        for(int key:map.keySet()){
            List<verticalPair> ll=map.get(key);
            Collections.sort(ll,new Comparator<verticalPair>(){
                @Override
                public int compare(verticalPair o1,verticalPair o2){
                    if(o1.l==o2.l){
                        return o1.node.val-o2.node.val;
                    }
                    return 0;
                }
            });
            List<Integer> list=new ArrayList<>();
            for(verticalPair v:ll){
                list.add(v.node.val);
            }
            ans.add(list);
        }
        return ans;
    }
}