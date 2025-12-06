// Last updated: 12/6/2025, 11:56:52 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int []lastseen={-1,-1,-1};
        int count=0;

        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1){
                count +=1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
            }
        }
        return count;
        
    }
}