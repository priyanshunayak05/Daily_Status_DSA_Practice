// Last updated: 8/1/2025, 1:56:08 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        int high=arr.length-k;
        while(low<high){
            int mid =low+(high-low)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        List<Integer> result=new ArrayList<>();

        for(int i=low;i<low+k;i++){
            result.add(arr[i]);
        }
        return result;
    }
}