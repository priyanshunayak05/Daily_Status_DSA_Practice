// Last updated: 8/1/2025, 1:55:30 PM
class Solution {
    public boolean canConstruct(String s, int k) {
         if(k>s.length()){
            return false;
        }
        int cout=count(s);
       return cout<=k;
    }
    public static int count(String s){
      
        int []freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int c=0;
        for(int f:freq){
            if(f%2!=0){
                c++;
            }
        }
        return c;
    }
}