// Last updated: 8/1/2025, 1:56:45 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int l=0;
        int h=num/2;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            long square=(long) mid*mid;
            if(square==num){ 
                return true;
              
            }
            else if(square<num){
                 l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return false;
        
       
    }
}