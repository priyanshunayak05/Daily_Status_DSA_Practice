// Last updated: 9/27/2025, 7:26:13 PM
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