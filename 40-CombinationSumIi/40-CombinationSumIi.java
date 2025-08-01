// Last updated: 8/1/2025, 1:58:18 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>li=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        Print(candidates,target,0,li,ans);
       return ans;
    }
    public static void Print(int[]arr,int target,int idx,List<Integer>li,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;

        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(target>=arr[i]){
                li.add(arr[i]);
                Print(arr,target-arr[i],i+1,li,ans);
                li.remove(li.size()-1);
            }
             
        }
       
    }
}