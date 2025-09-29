// Last updated: 9/29/2025, 2:22:30 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum +=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
        
    }
}