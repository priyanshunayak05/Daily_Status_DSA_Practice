// Last updated: 2/10/2026, 12:37:44 PM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        Queue<TreeNode>q=new LinkedList<>();
19        q.add(root);
20        int level=0;
21
22        while(!q.isEmpty()){
23            int size=q.size();
24            List<TreeNode>curr=new ArrayList<>();
25            for(int i=0;i<size;i++){
26                TreeNode node=q.poll();
27                curr.add(node);
28            
29                if(node.left!=null)q.add(node.left);
30                if(node.right!=null)q.add(node.right);
31            
32
33        }
34        if(level%2==0){
35            int prev=Integer.MIN_VALUE;
36            for(TreeNode node:curr){
37                int val=node.val;
38                if(val%2==0)return false;
39
40                if(val<=prev)return false;
41                prev=val;
42            }
43            
44        }else{
45            int next=Integer.MAX_VALUE;
46            for(TreeNode node:curr){
47                int val=node.val;
48                if(val%2 !=0)return false;
49
50                if(val>=next)return false;
51                next=val;
52            }
53        }
54        level++;
55        }
56        return true;
57    }
58}