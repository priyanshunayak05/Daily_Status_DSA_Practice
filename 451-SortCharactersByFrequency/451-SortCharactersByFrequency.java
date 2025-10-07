// Last updated: 10/7/2025, 4:26:30 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int c=1;
        int prev=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-prev >k){
                c++;
                prev=nums[i];
            }
                
        }
        return c;
        
    }
}