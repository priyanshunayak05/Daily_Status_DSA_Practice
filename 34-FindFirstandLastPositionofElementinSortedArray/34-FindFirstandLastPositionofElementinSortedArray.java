// Last updated: 9/18/2025, 5:59:17 PM
class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid= left+(right-left)/2;

            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
        
    }
}