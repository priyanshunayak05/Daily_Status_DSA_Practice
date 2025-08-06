// Last updated: 8/6/2025, 8:15:45 PM
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
    public int maxPathSum(TreeNode root) {
        int[]max=new int[1];
        max[0]=Integer.MIN_VALUE;
        maxpath(root,max);
        return max[0];
        
    }
    public int maxpath(TreeNode root, int []max){
        if(root ==null){
            return 0;
        }
        int left=Math.max(0,maxpath(root.left,max));
        int right=Math.max(0,maxpath(root.right,max));
        max[0]=Math.max(max[0],left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}