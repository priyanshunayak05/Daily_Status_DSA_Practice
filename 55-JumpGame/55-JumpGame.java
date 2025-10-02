// Last updated: 10/2/2025, 6:57:07 PM
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIdx=nums[0];
        for(int i=1;i<n-1;i++){
            if(i<=maxIdx){
                maxIdx=Math.max(maxIdx,nums[i]+i);
            }
        }
        return maxIdx>=n-1?true:false;
    }
}