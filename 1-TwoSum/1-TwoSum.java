// Last updated: 8/1/2025, 1:58:54 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                return new int [] {i,j};


            }
            
            }
         
        }
        return new int[]{};
    }
    
    }
