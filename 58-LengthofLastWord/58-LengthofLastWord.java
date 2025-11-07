// Last updated: 11/8/2025, 12:04:09 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastidx=s.lastIndexOf(" ");
        return s.length()-lastidx-1;
        
    }
}