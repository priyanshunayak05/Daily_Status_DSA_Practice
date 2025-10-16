// Last updated: 10/16/2025, 10:19:20 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}