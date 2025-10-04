// Last updated: 10/4/2025, 7:16:33 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        
        Set<List<Integer>>list=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        Non(nums,0,list,ans);
        return new ArrayList(list);
        
    }
    public static void Non(int[] nums,int idx,Set<List<Integer>>list,List<Integer>ans){
        if(idx==nums.length){
            if(ans.size()>=2){
             list.add(new ArrayList(ans));
        }
        return;

        }
        
    
        if(ans.isEmpty() || nums[idx]>=ans.get(ans.size()-1)){
            ans.add(nums[idx]);
            Non(nums,idx+1,list,ans);
            ans.remove(ans.size()-1);
        }
        Non(nums,idx+1,list,ans);
    }
}