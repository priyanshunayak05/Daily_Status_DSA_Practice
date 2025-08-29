// Last updated: 8/29/2025, 8:18:41 PM
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
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isvalid(TreeNode root, long min,long max){
        if(root==null) return true;
        if(root.val>=max || root.val<=min) return false;
        return isvalid(root.left,min,root.val) && isvalid(root.right,root.val,max);
    }
}