// Last updated: 8/1/2025, 1:55:22 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int size=nums.length;
        int left[]= new int[size];
        left[0]=nums[0];
        for(int i =1;i<size;i++){
            left[i]=left[i-1]+nums[i];
        }
        return left;
    }
}
