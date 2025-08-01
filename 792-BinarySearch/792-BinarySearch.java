// Last updated: 8/1/2025, 1:55:59 PM
class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+((h-l)/2);
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
        return -1;
}
}
