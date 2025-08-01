// Last updated: 8/1/2025, 1:57:38 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int total=0;
		for(int i=0;i<cost.length;i++) {
			total +=gas[i] -cost[i];
		}
		if(total<0) {
			return -1;
		}
		int idx=0;
		int cur=0;
		for(int i=0;i<cost.length;i++) {
			cur +=gas[i]-cost[i];
			if(cur<0) {
				cur=0;
				idx =i+1;
			}
		}
		return idx;
	}
}