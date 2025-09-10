// Last updated: 9/10/2025, 9:24:11 PM
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstfrompreorder(preorder,Integer.MAX_VALUE,new int[]{0});
        
    }
    public TreeNode bstfrompreorder(int []A,int border,int[]i){
        if(i[0]==A.length || A[i[0]]>border) return null;

        TreeNode root=new TreeNode (A[i[0]++]);
        root.left=bstfrompreorder(A,root.val,i);
        root.right=bstfrompreorder(A,border,i);
        return root;
    }
}