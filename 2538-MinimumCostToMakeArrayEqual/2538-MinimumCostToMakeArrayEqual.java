// Last updated: 12/6/2025, 11:56:23 PM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        long mini=Long.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int l:nums){
            left=Math.min(left,l);
            right=Math.max(right,l);
        }

        while(left<=right){
            int mid=left+(right-left)/2;

            long cost1=findcost(nums,cost,mid);
            long cost2=findcost(nums,cost,mid+1);
            mini =Math.min(mini,Math.min(cost1,cost2));
            if(cost2>cost1){
                right=mid-1;
            }
            else{
                left=mid+1;
            }


        }
        return mini;

    
        
    }
    public static long findcost(int []nums,int []cost,int target){
        long res=0;
        for(int i=0;i<nums.length;i++){
             res +=  (long)Math.abs( nums[i] - target) * cost[i];
        }
        return res;
    }
}