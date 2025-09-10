// Last updated: 9/10/2025, 9:24:38 PM
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> res=new ArrayList<>();
        Inorder(root,res);
        int i=0;
        int j=res.size()-1;
        while(i<j){
            int sum=(res.get(i)+res.get(j));
            if(sum==k){
                return true;
            }
            else if (sum < k){
                i++;
            }
            else{
                j--;
            }
           
        }
        return false;

        
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