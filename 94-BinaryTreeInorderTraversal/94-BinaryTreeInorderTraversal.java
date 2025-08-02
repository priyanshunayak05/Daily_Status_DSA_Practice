// Last updated: 8/2/2025, 7:37:30 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Inorder(root,res);
        return res;
        
    }
    public static void Inorder(TreeNode root,List<Integer>res){
        if(root ==null){
            return;
        }
        Inorder(root.left,res);
        res.add(root.val);
        Inorder(root.right,res);

    }
}