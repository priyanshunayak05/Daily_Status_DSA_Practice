// Last updated: 12/6/2025, 11:57:52 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Trick: count(sum == goal) = atMost(goal) - atMost(goal - 1)
       return atmost(nums,goal) -atmost(nums,goal-1);
    }
    public static int atmost(int nums[],int goal){
         if(goal<0) return 0;
        int l=0,r=0,sum=0,cut=0;
        while(r<nums.length){
            sum +=nums[r];
            while(sum>goal){
                sum =sum-nums[l];
                l=l+1;
            }
            cut=cut+(r-l+1);
            r=r+1;
        }
        return cut;
    }
}