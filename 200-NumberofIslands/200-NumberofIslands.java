// Last updated: 9/29/2025, 11:32:46 PM
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=i;j<nums.length;j++){
                pro *=nums[j];
                max =Math.max(max,pro);
            }
            
        }
        return max;

    }
}