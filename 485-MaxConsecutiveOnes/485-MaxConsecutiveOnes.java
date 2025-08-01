// Last updated: 8/1/2025, 1:56:19 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int num:nums){
            if(num==1){
                c++;
                max=Math.max(max,c);
            }
            else{
                c=0;
            }
        }
        return max;
        
    }
}