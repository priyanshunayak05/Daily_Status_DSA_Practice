// Last updated: 8/18/2025, 9:59:20 PM
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root ==null) return -1;
        List<Long>listsum=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                sum +=node.val;

                if(node.left !=null) queue.add(node.left);
                if(node.right !=null) queue.add(node.right);
            }
            listsum.add(sum);
           
        }
        Collections.sort(listsum,Collections.reverseOrder());
        if(k>listsum.size()) return -1;
        return listsum.get(k-1);
        
    }
}