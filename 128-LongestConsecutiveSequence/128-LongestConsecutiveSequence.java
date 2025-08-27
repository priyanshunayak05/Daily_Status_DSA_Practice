// Last updated: 8/27/2025, 12:49:43 PM
class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer>s=new HashSet<>();
        for(int x:arr){
            s.add(x);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i]-1)){
                int c=0;
                int key=arr[i];
                while(s.contains(key)){
                    s.remove(key);
                    c++;
                    key++;
                }
                ans =Math.max(ans,c);
            }
        }
        return ans;
    }
}