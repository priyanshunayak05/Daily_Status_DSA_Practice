// Last updated: 8/5/2025, 7:37:44 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l1=new ArrayList<>();
        RightSearch(root,1,l1);
        return l1;
        
    }
    int maxd=0;
    public void RightSearch(TreeNode root, int cl,List<Integer>l1){
        if(root==null){
            return;
        }
        if(maxd<cl){
            l1.add(root.val);
            maxd=cl;
        }
        RightSearch(root.right,cl+1,l1);
        RightSearch(root.left,cl+1,l1);
    }
}