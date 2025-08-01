// Last updated: 8/1/2025, 1:56:29 PM
class Solution {
    public int arrangeCoins(int n) {
        long l=0;
		long h=n;
		while(l<=h) {
			long mid=l+(h-l)/2;
			long cur=mid*(mid+1)/2;
			if(cur==n) {
				return (int)mid;
				
			}
			else if(cur<n) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return (int)h;
	}

}
