// Last updated: 8/1/2025, 1:58:31 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] !=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}