// Last updated: 8/2/2025, 8:49:43 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Postorder(root,res);
        return res;
        
    }
    public static void Postorder(TreeNode root, List<Integer>res){
        if(root == null){
            return;
        }
        Postorder(root.left,res);
        Postorder(root.right,res);
        res.add(root.val);
       
        
    }
}