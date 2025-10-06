// Last updated: 10/6/2025, 6:28:09 PM
class Solution {
    int res=0;
    public int countArrangement(int n) {
        int []nums=new int[n+1];
        search(nums,1,n);
        return res;
    }
    public void search(int[]nums,int val,int n){
    if(val>n){
        res++;
        return;
    }
    for(int i=1;i<=n;i++){
        if(nums[i]==0 &&(val%i==0 || i%val==0)){
            nums[i]=val;
            search(nums,val+1,n);
            nums[i]=0;
        }
    }
    }
}