// Last updated: 9/27/2025, 9:07:39 PM
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int k=n-1;k>=2;k--){
            int left=0;
            int right=k-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[k]){
                    count +=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}