// Last updated: 1/9/2026, 5:11:12 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices.length==0){
4            return 0;
5        }
6        int buy1=Integer.MIN_VALUE;
7        int sell1=0;
8        int buy2=Integer.MIN_VALUE;
9        int sell2=0;
10
11        for(int price:prices){
12            buy1=Math.max(-price,buy1);
13            sell1=Math.max(sell1,buy1+price);
14            buy2=Math.max(sell1-price,buy2);
15            sell2=Math.max(sell2,buy2+price);
16        }
17        return sell2;
18
19    }
20}