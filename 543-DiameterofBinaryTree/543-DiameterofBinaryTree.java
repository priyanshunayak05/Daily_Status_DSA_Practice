// Last updated: 8/3/2025, 9:09:00 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        int []diameter=new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public int height(TreeNode root, int [] diameter){
        if(root ==null){
            return 0;
        }
        int l=height(root.left,diameter);
        int r=height(root.right,diameter);
        diameter[0]=Math.max(diameter[0],l+r);
        return 1+Math.max(l,r);
    }
}