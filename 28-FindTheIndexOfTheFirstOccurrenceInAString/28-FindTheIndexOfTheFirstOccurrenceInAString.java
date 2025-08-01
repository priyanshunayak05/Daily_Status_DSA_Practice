// Last updated: 8/1/2025, 1:58:27 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int h=haystack.length();
        int n=needle.length();
        for(int i=0;i<=h-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}