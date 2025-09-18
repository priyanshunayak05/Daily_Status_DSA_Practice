// Last updated: 9/18/2025, 4:54:10 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};

    }
    public static int first(int []nums,int target){
        int l=0;
        int r=nums.length-1;
        int index=-1;
        while(l<=r){
            int mid=l+(r-l)/2;

              if(nums[mid]==target){
                index=mid;
            }
            if(nums[mid]>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
          
        }
        return index;
    }
     public static int last(int []nums,int target){
        int l=0;
        int r=nums.length-1;
        int index=-1;
        while(l<=r){
            int mid=l+(r-l)/2;

                if(nums[mid]==target){
                index=mid;
            }
            if(nums[mid]<=target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        
        }
        return index;
    }
}