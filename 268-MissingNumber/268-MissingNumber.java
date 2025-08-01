// Last updated: 8/1/2025, 1:56:56 PM
class Solution {
    public int missingNumber(int[] nums) {
       int exp_sum=0;
       int sum=0;
       int n=nums.length;
       exp_sum=n*(n+1)/2;
       for(int num:nums){
        sum +=num;
       } 
       return exp_sum-sum;
    }
}