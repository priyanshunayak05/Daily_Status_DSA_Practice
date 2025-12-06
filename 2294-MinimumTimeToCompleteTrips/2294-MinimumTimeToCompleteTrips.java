// Last updated: 12/6/2025, 11:56:30 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l=0;
        long r=100000000000000L;
        long ans=r;
        while(l<r){
            long mid=(l+r)/2;
            long count=0;
            for(int i=0;i<time.length;i++){
                count +=mid/time[i];
                
            }
            if(count >=totalTrips){
                    ans=Math.min(ans,mid);
                    r=mid;
                }
                else{
                    l=mid+1;
                }
        }
        return ans;
        
    }
}