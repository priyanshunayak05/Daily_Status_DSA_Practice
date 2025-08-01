// Last updated: 8/1/2025, 1:56:37 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] charcheck=new int[26];
        for(int i=0;i<s.length();i++){
            charcheck[s.charAt(i)-'a']++;
        }
         for(int i=0;i<s.length();i++){
            if(charcheck[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}