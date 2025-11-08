// Last updated: 11/8/2025, 8:33:56 PM
class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int num:nums){
            max=Math.max(max,num);
        }


        int sum=0;
        for(int num:nums){
            sum +=max-num;
        }


        return sum;


        
    }
}