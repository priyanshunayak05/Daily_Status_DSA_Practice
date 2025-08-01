// Last updated: 8/1/2025, 1:58:49 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int t=x;
        while(t !=0){
            int rem=t%10;
            sum =sum*10+rem;
            t /=10;
        }
        return(sum==x);
        
    
    }
}