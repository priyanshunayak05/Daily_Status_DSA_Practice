// Last updated: 10/9/2025, 6:24:45 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;


       for(int right=0;right<nums.length;right++){
            sum +=nums[right];
            while(sum >=target){
                minlen =Math.min(minlen,right-left+1);
                sum -=nums[left];
                left++;
            }
            
        }
        // it works when minlen doesnot change
        return minlen==Integer.MAX_VALUE?0:minlen;

    }
}