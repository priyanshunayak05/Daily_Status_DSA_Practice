// Last updated: 8/3/2025, 8:24:03 PM
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
    public boolean isBalanced(TreeNode root) {
        return (diff(root)!=-1);
        
    }
    public static int diff(TreeNode root){
       if(root ==null){
        return 0;
       }
       int l=diff(root.left);
       if(l==-1){
        return -1;
       }
       int r=diff(root.right);

       if(r==-1){
        return -1;
       }
       if(Math.abs(l-r)>1){
        return -1;
       }
       return Math.max(l,r)+1;

    }

}