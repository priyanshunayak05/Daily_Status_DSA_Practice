// Last updated: 8/1/2025, 1:58:22 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l++;
            }
            else{
                h--;
            }
        }
        return l;
    }
}