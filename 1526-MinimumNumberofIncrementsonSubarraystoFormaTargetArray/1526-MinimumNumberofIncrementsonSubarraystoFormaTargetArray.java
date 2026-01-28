// Last updated: 1/29/2026, 12:28:57 AM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int t=0;
4        int target=tickets[k];
5
6        for(int i=0;i<tickets.length;i++){
7            if(i<=k){
8                t +=Math.min(tickets[i],target);
9            }
10            else{
11                t+=Math.min(tickets[i],target-1);
12            }
13            
14        }
15        return t;
16    }
17}