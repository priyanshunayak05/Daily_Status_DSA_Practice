// Last updated: 12/6/2025, 11:56:46 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pos=-1;
        int i=0;
        while(i<nums.length && nums[i]!=1){
            i++;
        }
        pos=i;

        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==1){
                if(j-pos-1<k){
                return false;
                }
                pos=j;
            }
            
            
        }return true;
        
    }
}