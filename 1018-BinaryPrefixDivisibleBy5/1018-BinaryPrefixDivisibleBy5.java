// Last updated: 11/24/2025, 8:53:50 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
     List<Boolean> ans=new ArrayList<>();
        int num=0;
        for(int i:nums){
            num = (num*2+i)%5;
            ans.add(num == 0);
        }
        return ans;
    }
}