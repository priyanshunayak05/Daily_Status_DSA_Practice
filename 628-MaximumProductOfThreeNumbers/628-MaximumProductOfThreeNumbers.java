// Last updated: 12/6/2025, 11:58:15 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        int a=nums[0];
        int b=nums[1];
        int c=nums[n-1];
        int d=nums[n-2];
        int e=nums[n-3];

        int minproduct=a*b*c;
        int maxproduct=c*d*e;
        return Math.max(minproduct,maxproduct);
        
    }
}