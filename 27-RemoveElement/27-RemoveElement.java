// Last updated: 8/1/2025, 1:58:29 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[j]=nums[i];
                j++;
			}
		}
		return j;
    }
}