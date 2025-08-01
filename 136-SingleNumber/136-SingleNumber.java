// Last updated: 8/1/2025, 1:57:37 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res ^=num;
        }
        return res;
    }
}