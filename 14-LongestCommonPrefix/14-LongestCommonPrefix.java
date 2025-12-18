// Last updated: 12/18/2025, 11:02:18 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) {
4            return "";
5        }
6        String prefix = strs[0];
7        for(int i=1;i<strs.length;i++){
8           while(strs[i].indexOf(prefix )!=0){
9            prefix = prefix.substring(0,prefix.length()-1);
10           
11           if(prefix.isEmpty()){
12            return "";
13           }
14        }
15        }
16        return prefix;
17    }
18}