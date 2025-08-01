// Last updated: 8/1/2025, 1:56:21 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclesort(nums);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
        
    }
    public static void cyclesort(int []nums){
        int i=0;
        while(i<nums.length){
            int element=nums[i];
            int corr=element-1;
            if(nums[i]!=nums[corr]){
                swap(nums,i,corr);
            }
            else{
                i++;
            }
        }

    }
    public static void swap(int[]nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}