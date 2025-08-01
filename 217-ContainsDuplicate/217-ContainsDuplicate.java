// Last updated: 8/1/2025, 1:57:09 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
      
       }
       return false;
    }
}