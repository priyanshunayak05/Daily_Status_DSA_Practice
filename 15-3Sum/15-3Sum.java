// Last updated: 9/26/2025, 5:15:40 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
      
    
        for(int i=0;i<n-2;i++){
            int j=i+1; int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            }
            return new ArrayList<>(set);
    }
}