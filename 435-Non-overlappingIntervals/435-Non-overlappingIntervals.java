// Last updated: 1/10/2026, 2:20:30 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
4        int c=0;
5        int i=1;     // start checking from second interval
6        int prev = intervals[0][1]; // prev = 2 (end of first interval)
7        while(i<intervals.length){
8            if(prev>intervals[i][0]){
9                c++;
10            }
11            else{
12                prev=intervals[i][1];
13            }
14            i++;
15        }
16        return c;
17    }
18}