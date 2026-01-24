// Last updated: 1/25/2026, 12:42:33 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb=new StringBuilder();
4        int dept=0;
5
6        for(char ch:s.toCharArray()){
7            if(ch=='('){
8                if( dept >0){
9                sb.append(ch);
10                }
11                dept++;
12            }
13            else{
14                if(ch==')'){
15                    if(dept >1){
16                        sb.append(ch);
17                    }
18                    dept--;
19                }
20            }
21        }
22        return sb.toString();
23        
24    }
25}