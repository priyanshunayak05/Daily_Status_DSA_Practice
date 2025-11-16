// Last updated: 11/16/2025, 5:29:13 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int mindiff=Integer.MAX_VALUE;
        List<List<Integer>>res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            mindiff=Math.min(mindiff,(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mindiff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }

        }
        return res;
        
    }
}