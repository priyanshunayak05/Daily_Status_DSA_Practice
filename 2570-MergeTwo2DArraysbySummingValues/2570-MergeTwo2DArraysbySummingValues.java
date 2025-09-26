// Last updated: 9/26/2025, 1:57:19 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]>buyprice){
                maxprofit = Math.max(maxprofit,prices[i]-buyprice);
            }
            buyprice=Math.min(buyprice,prices[i]);
        }
        return maxprofit; 
    }
   
}