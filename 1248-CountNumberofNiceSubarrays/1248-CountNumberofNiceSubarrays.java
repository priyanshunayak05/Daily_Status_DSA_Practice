// Last updated: 9/18/2025, 12:57:54 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public static int atmost(int []nums,int goal){
        if(goal <0)return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum +=(nums[r]%2);

            while(sum>goal){
                sum=sum-(nums[l]%2);
                l++;
            }
            count +=(r-l+1);
            r=r+1;
            
        }
        return count;
    }
}