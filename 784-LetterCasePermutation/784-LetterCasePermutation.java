// Last updated: 1/10/2026, 10:36:40 PM
1class Solution {
2    public List<String> letterCasePermutation(String s) {
3        List<String>lst=new ArrayList<>();
4        back(0,s,new StringBuilder(),lst);
5        return lst;
6
7        
8    }
9    public static void back(int idx,String s,StringBuilder st,List<String>lst){
10        if(idx == s.length()){
11            lst.add(st.toString());
12            return;
13        }
14        char ch=s.charAt(idx);
15
16        if(Character.isDigit(ch)){
17            st.append(ch);
18            back(idx+1,s,st,lst);
19            st.deleteCharAt(st.length()-1);
20        }
21        else{
22            st.append(Character.toLowerCase(ch));
23            back(idx+1,s,st,lst);
24            st.deleteCharAt(st.length()-1);
25
26
27            st.append(Character.toUpperCase(ch));
28            back(idx+1,s,st,lst);
29            st.deleteCharAt(st.length()-1);
30        }
31    }
32}