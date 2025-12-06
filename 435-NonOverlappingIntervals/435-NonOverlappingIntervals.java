// Last updated: 12/6/2025, 11:58:49 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int c=0;
        int i=1;
        int prev=intervals[0][1];
        while(i<intervals.length){
            if(prev>intervals[i][0]){
                c++;
            }
            else{
                prev=intervals[i][1];
            }
            i++;
        }
        return c;
    }
}