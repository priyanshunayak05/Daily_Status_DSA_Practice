// Last updated: 3/18/2026, 7:39:52 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        
4        Stack<Integer>st=new Stack<>();
5        st.push(-1);
6        int maxlen=0;
7        for(int i=0;i<s.length();i++){
8            if(s.charAt(i)=='('){
9                st.push(i);
10            }
11            else{
12                st.pop();
13                if(st.isEmpty()){
14                    st.push(i);
15                }
16                else{
17                    maxlen=Math.max(maxlen,i-st.peek());
18                }
19            }
20        }
21        return maxlen;
22    }
23}