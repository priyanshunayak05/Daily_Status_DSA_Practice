// Last updated: 8/1/2025, 1:56:54 PM
class Solution {
    public int hIndex(int[] citations) {
        int l=0;
        int n=citations.length;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(citations[mid]>=n-mid){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return n-l;
    }
}