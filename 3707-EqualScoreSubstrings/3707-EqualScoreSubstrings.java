// Last updated: 10/12/2025, 11:24:09 PM
class Solution {
    public boolean scoreBalance(String s) {
       

       for(int i=1;i<s.length();i++){
        int sum1=0;
        int sum2=0;

        for(int j=0;j<i;j++){
            sum1 +=s.charAt(j)-'a'+1;
        }

         for(int j=i;j<s.length();j++){
            sum2 +=s.charAt(j)-'a'+1;
        }

        if(sum1==sum2){
            return true;
        }



       }
       return false;
        
        
    }
}