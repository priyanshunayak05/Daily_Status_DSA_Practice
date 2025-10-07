// Last updated: 10/7/2025, 4:05:07 PM
class Solution {
    public int minimumOperations(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]%3!=0 ){
            count++;
        }
    }
    return count;
    }
}