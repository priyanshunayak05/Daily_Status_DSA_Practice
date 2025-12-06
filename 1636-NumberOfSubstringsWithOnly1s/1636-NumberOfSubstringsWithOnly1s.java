// Last updated: 12/6/2025, 11:56:43 PM
class Solution {
    public int numSub(String s) {
        long ans=0;
        
        long count=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;

            }
            else{
                ans +=(count*(count+1))/2;
                count=0;
            }

            
        }
        ans +=(count*(count+1))/2;
        
        return (int)(ans%(1e9+7));
        
    }
}