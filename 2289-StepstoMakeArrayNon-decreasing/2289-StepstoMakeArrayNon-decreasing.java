// Last updated: 2/4/2026, 3:28:00 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]>st=new Stack<>();
4        int ans=0;
5        for(int x:nums){
6            int step=0;
7            while(!st.isEmpty() && st.peek()[0]<=x){
8                step=Math.max(step,st.peek()[1]);
9                st.pop();
10            }
11            if(st.isEmpty()){
12                step=0;
13            }
14            else{
15                step=step+1;
16            }
17            ans=Math.max(ans,step);
18            st.push(new int[]{x,step});
19        }
20        return ans;
21        
22    }
23}