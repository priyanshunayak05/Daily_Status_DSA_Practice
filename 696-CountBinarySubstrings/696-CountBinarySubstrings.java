// Last updated: 8/25/2025, 10:45:00 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;
        int index=1;
        int prev=0;
        int curr=1;

        while(index<s.length()){
            if(s.charAt(index-1)!=s.charAt(index)){
                count +=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
            else{
                curr++;
            }
            index++;
        }
        return count +=Math.min(prev,curr);
    }
}