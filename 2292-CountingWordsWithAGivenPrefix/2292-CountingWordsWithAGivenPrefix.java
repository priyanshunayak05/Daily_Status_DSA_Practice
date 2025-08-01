// Last updated: 8/1/2025, 1:55:27 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}