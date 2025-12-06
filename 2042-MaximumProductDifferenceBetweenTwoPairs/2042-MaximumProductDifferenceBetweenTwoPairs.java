// Last updated: 12/6/2025, 11:56:33 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}