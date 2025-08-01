// Last updated: 8/1/2025, 1:56:49 PM
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] ans = new boolean[nums.length];   
        for(int num : nums) {
            ans[num] = !ans[num];
            if(!ans[num]) {
                return num;
            }
        }
        return 0;
    }
}