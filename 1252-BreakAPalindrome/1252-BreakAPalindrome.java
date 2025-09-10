// Last updated: 9/10/2025, 9:24:05 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        char[]cstr=palindrome.toCharArray();
        if(cstr.length<2) return "";
        for(int i=0;i<cstr.length/2;i++){
            if(cstr[i]!='a'){
                cstr[i]='a';
                return String.valueOf(cstr);
            }
        }
        cstr[cstr.length-1]='b';
        return String.valueOf(cstr);
        
    }
}