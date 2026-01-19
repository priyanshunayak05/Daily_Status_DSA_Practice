// Last updated: 1/19/2026, 12:33:44 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n=arr.length;
4        long ans=0;
5
6        int []left1=new int[n];
7        int[]right2=new int[n];
8
9        Stack<Integer>st=new Stack<>();
10        for(int i=0;i<n;i++){
11            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
12                st.pop();
13            }
14            left1[i]=st.isEmpty()?-1:st.peek();
15            st.push(i);
16        }
17        st.clear();
18
19        // right side next smaller element
20
21        for(int i=n-1;i>=0;i--){
22            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
23                st.pop();
24            }
25            right2[i]=st.isEmpty()?n:st.peek();
26            st.push(i);
27        }
28
29
30
31        // number of ways 
32
33        for(int i=0;i<n;i++){
34            long left=i-left1[i];
35            long right=right2[i]-i;
36
37            ans = ((ans+ arr[i]*left*right)%(int)(1e9+7));
38        }
39        return(int) ans;
40    }
41}