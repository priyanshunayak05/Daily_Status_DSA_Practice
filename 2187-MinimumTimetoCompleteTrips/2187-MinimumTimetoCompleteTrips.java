// Last updated: 12/26/2025, 10:45:14 PM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        long l=0;
4        long r=100000000000000L;
5        long ans=r;
6        while(l<r){
7            long mid=(l+r)/2;
8            long count=0;
9            for(int i=0;i<time.length;i++){
10                count +=mid/time[i];
11                
12            }
13            if(count >=totalTrips){
14                    ans=Math.min(ans,mid);
15                    r=mid;
16                }
17                else{
18                    l=mid+1;
19                }
20        }
21        return ans;
22        
23    }
24}