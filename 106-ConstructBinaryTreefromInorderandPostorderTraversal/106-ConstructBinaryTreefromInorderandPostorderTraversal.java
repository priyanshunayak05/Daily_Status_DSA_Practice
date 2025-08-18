// Last updated: 8/18/2025, 9:18:33 PM
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode createTree(int[] inorder,int[] postorder,int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi) return null;
        TreeNode node=new TreeNode(postorder[phi]);
        int idx=Findinorder(inorder,ilo,ihi,postorder[phi]);
        int c=idx-ilo;
        node.left=createTree(inorder,postorder,ilo,idx-1,plo,plo+c-1);
        node.right=createTree(inorder,postorder,idx+1,ihi,plo+c,phi-1);
        return node;
    }
    public int Findinorder(int[] inorder,int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(inorder[i]==item){
                return i;
            }
        }
        return 0;

    }
}