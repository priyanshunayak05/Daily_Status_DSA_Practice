// Last updated: 1/20/2026, 3:03:30 PM
1class Solution {
2    public int maxSumMinProduct(int[] nums) {
3        int n=nums.length;
4        Stack<Integer>st=new Stack<>();
5        int[]left=new int[n];
6        int[] right=new int[n];
7
8        for(int i=0;i<n;i++){
9            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
10                st.pop();
11            }
12            left[i]=st.isEmpty()?-1:st.peek();
13            st.push(i);
14        }
15        st.clear();
16
17        for(int i=n-1;i>=0;i--){
18            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
19                st.pop();
20            }
21            right[i]=st.isEmpty()?n:st.peek();
22            st.push(i);
23        }
24        long prefix[]=new long[n+1];
25        for(int i=0;i<n;i++){
26            prefix[i+1]=prefix[i]+nums[i];
27        }
28
29        long ans=0;
30        for(int i=0;i<n;i++){
31            int l=left[i]+1;
32            int r=right[i]-1;
33
34            long sum=prefix[r+1]-prefix[l];
35            ans=Math.max(ans,sum*nums[i]);
36        }
37
38        return (int)(ans % 1_000_000_007);
39
40
41        
42    }
43}