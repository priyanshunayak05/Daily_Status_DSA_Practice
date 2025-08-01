// Last updated: 8/1/2025, 1:55:45 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEat(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean canEat(int[] piles,int mid,int h){
        int timeTaken=0;
        for(int pile:piles){
            timeTaken +=Math.ceil(pile/(double)mid);
            if(timeTaken>h){
                return false;
            }
        }
        return true;
    }
}