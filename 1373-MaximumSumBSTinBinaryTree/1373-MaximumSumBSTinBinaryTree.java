// Last updated: 8/7/2025, 12:37:10 PM
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
    public int maxSumBST(TreeNode root) {
        return isBalance(root).ans;
    }

    private BalancePair isBalance(TreeNode root) {
        if(root==null) {
            return new BalancePair();
        }
        BalancePair lbp=isBalance(root.left);
        BalancePair rbp=isBalance(root.right);
        BalancePair sbp=new BalancePair();
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.sum=lbp.sum+rbp.sum+root.val;
        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;

        if(sbp.isbst) {
            sbp.ans=Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        } else {
            sbp.ans=Math.max(lbp.ans,rbp.ans);
        }
        return sbp;
    }

    class BalancePair {
        boolean isbst=true; 
        long max=Long.MIN_VALUE; 
        long min=Long.MAX_VALUE; 
        int sum=0;
        int ans=0;
        }
}