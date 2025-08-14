// Last updated: 8/14/2025, 11:17:15 AM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
    }
    public int minCamera(TreeNode root){
        if(root ==null){
            return 0;
        }
        int left =minCamera(root.left);
        int right=minCamera(root.right);
        if(left ==-1 || right ==-1){ //-1 is need for the camera in this node
            camera++;
            return 1; //set up the camera is node pr
        }
        if(left ==1 || right ==1){ //inme kisi ke paas camera hai and dusra wala covered hai
            return 0; // iska mtlb mai covered hu 
        }
        else{
            return -1; // need a camera 
        }
    }
}