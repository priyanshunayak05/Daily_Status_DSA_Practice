// Last updated: 8/1/2025, 1:56:32 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                c++;
            }
            if(c==3){
                return nums[i];
            }
        }
        return nums[n-1];
       
    }
}