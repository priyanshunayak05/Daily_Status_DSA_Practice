// Last updated: 2/10/2026, 11:35:48 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode reverseOddLevels(TreeNode root) {
18        Queue<TreeNode>q=new LinkedList<>();
19        q.add(root);
20        int level=0;
21        while(!q.isEmpty()){
22            int size=q.size();
23            List<TreeNode>curr=new ArrayList<>();
24            for(int i=0;i<size;i++){
25                TreeNode node=q.poll();
26                curr.add(node);
27                if(node.left !=null) q.add(node.left);
28                if(node.right!=null)q.add(node.right);
29            }
30            if(level%2==1){
31                int i=0;
32                int j=curr.size()-1;
33
34                while(i<j){
35                    int temp=curr.get(i).val;
36                    curr.get(i).val=curr.get(j).val;
37                    curr.get(j).val=temp;
38                    i++;
39                    j--;
40                }
41            }
42            level++;
43
44        }
45        return root;
46        
47    }
48}