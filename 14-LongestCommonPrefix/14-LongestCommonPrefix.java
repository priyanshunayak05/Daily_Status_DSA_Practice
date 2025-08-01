// Last updated: 8/1/2025, 1:58:45 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
           while(strs[i].indexOf(prefix )!=0){
            prefix = prefix.substring(0,prefix.length()-1);
           
           if(prefix.isEmpty()){
            return "";
           }
        }
        }
        return prefix;
    }
}