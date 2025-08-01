// Last updated: 8/1/2025, 1:58:43 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int close=nums[0]+nums[1]+nums[2];
       for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum= nums[i]+nums[left]+nums[right];

            if(sum==target){
                return sum;
            }
            if(Math.abs(sum-target)<Math.abs(close-target)){
                close=sum;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
       }
       return close;
    }
}