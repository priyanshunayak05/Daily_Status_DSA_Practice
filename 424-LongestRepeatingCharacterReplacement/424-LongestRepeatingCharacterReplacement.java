// Last updated: 8/1/2025, 1:56:31 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxfreq=0,maxlength=0;
        int []count=new int[26];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            count[ch-'A']++;

            maxfreq=Math.max(maxfreq,count[ch-'A']);

            //'shrink'
            int window=right-left+1;

            if(window-maxfreq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}