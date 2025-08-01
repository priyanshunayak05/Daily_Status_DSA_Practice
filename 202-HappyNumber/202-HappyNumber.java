// Last updated: 8/1/2025, 1:57:18 PM
class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        while(temp !=1 && temp!=4){
        double sum=0;   
        
        while(temp>0){
             int rem=temp%10;
             sum +=Math.pow(rem,2);
             temp /=10;
             }
             temp=(int)sum;
             sum=0;
        }
        return temp==1;
    }
}