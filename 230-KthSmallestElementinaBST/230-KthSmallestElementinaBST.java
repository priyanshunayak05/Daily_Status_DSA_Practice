// Last updated: 8/25/2025, 5:03:49 PM
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
    private int c=0;
    private int res=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
    public void inorder(TreeNode root,int k){
        if(root == null) return;

        inorder(root.left,k);
        c++;
        if(c==k){
            res=root.val;
            return;
        }

        inorder(root.right,k);
    }
}