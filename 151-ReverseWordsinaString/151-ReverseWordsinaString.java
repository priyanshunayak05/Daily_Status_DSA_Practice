// Last updated: 1/26/2026, 11:40:30 PM
1class Solution {
2    public String reverseWords(String s) {
3        s=s.trim();
4        String []word=s.split("\s+");
5        StringBuilder st=new StringBuilder();
6        for(int i=word.length-1;i>=0;i--){
7            st.append(word[i]).append(" ");
8        }
9
10        return st.toString().trim();
11    }
12}