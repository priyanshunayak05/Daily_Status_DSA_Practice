// Last updated: 9/2/2025, 11:35:42 PM
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
    int maxdepth=-1;
    TreeNode result=null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        postorder(root,0);
        return result;
    }
    public int postorder(TreeNode node,int depth){
        if(node==null)return depth;
        int left=postorder(node.left,depth+1);
        int right=postorder(node.right,depth+1);
        if(left==right){
            maxdepth=Math.max(maxdepth,right);
            if(maxdepth == right){
                result=node;
            }
        }
        return Math.max(left,right);
    }
}