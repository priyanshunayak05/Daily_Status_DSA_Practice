// Last updated: 8/3/2025, 11:47:02 AM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> l2=new LinkedList<List<Integer>>();
        if(root ==null){
            return l2;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int node_size=queue.size();
            List<Integer>ls=new LinkedList<Integer>();
            for(int i=1;i<=node_size;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right !=null){
                    queue.add(queue.peek().right);
                }
                ls.add(queue.poll().val);
            }
            l2.add(ls);
        }
        return l2;
        
    }
}