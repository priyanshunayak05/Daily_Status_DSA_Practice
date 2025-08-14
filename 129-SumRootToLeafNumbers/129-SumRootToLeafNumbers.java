// Last updated: 8/14/2025, 11:18:36 AM
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
    public int sumNumbers(TreeNode root) {
        return sumroot(root,0);
        
    }
    public int sumroot(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return sum*10+root.val;
        }
        int l=sumroot(root.left,sum*10+root.val);

        int r=sumroot(root.right,sum*10+root.val);

        return l+r;
    }
}