// Last updated: 8/14/2025, 11:18:45 AM
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
    public int maxDepth(TreeNode root) {
        if (root ==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int h=maxDepth(root.right);
        return Math.max(l,h)+1;
        
    }
}