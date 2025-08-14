// Last updated: 8/14/2025, 11:16:50 AM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int totalFinish1 = waterStart + waterDuration[j];
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int totalFinish2 = landStart + landDuration[i];
                minFinishTime = Math.min(minFinishTime, Math.min(totalFinish1, totalFinish2));
            }
        }
        
        return minFinishTime;
    }
}