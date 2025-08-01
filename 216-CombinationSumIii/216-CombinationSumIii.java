// Last updated: 8/1/2025, 1:57:11 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer>li=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Print(1,n,k,li,ans);
        return ans;

    }
    public static void Print(int start,int n,int k, List<Integer>li,List<List<Integer>>ans){
        if(li.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(li));
                return;
            }
        }
        for(int i=start;i<=9;i++){
            if(n<i) break;
            li.add(i);
            Print(i+1,n-i,k,li,ans);
            li.remove(li.size()-1);
        }
    }
}