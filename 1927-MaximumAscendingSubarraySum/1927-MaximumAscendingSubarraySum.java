// Last updated: 8/1/2025, 1:55:18 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
       int cur= nums[0];
       int maxsum=nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i] > nums[i-1]){
            cur +=nums[i];
        }
        else{
            maxsum = Math.max(maxsum,cur);
            cur =nums[i];
        }
       }
       return Math.max(maxsum,cur);
}
}
