// Last updated: 1/9/2026, 4:34:17 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3       if(prices.length==0){
4        return 0;
5       }
6       int profit=0;
7       for(int i=1;i<prices.length;i++){
8        if (prices[i]>prices[i-1]){
9            profit +=prices[i]-prices[i-1];
10        }
11       }
12       return profit;
13    }
14}