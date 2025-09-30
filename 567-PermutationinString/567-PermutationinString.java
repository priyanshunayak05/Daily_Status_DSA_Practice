// Last updated: 9/30/2025, 10:00:49 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int wsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int windx=0;
            int indx=i;
            int []freq2=new int[26];
            while(windx<wsize && indx<s2.length()){
                freq2[s2.charAt(indx)-'a']++;
                windx++;
                indx++;
            }
            if(ismatch(freq,freq2)){
                return true;
            }

        }
        return false;
    }
    public static boolean ismatch(int[]freq1,int []freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}