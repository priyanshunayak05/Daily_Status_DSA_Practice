// Last updated: 9/14/2025, 2:54:47 PM
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if (nums[i] > nums[(i+1) % nums.length]) {
                count++;
            }
           
        }
        if(count <=1){
            return true;
        }
        return false;
    }
}