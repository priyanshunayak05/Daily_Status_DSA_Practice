// Last updated: 1/20/2026, 12:03:04 PM
1class Solution {
2    public int minLength(String s) {
3        Stack<Character>st=new Stack();
4        for(char ch:s.toCharArray()){
5
6            if(!st.isEmpty()){
7                char top=st.peek();
8
9                if((top=='A' && ch=='B') ||(top=='C'&& ch=='D')){
10                    st.pop();
11                    continue;
12                }
13            }
14            st.push(ch);
15        }
16
17        return st.size();
18    
19        
20    }
21}