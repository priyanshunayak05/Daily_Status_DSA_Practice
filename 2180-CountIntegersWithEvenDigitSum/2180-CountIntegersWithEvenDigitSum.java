// Last updated: 1/5/2026, 11:43:47 AM
1class Solution {
2    public int countEven(int num) {
3        int count=0;
4
5        for(int i=1;i<=num;i++){
6            int sum=0;
7            int t=i;
8            while(t>0){
9                sum +=t%10;
10                t /=10;
11            }
12
13                if(sum%2==0){
14                    count++;
15                }
16            }
17        
18        return count;
19        
20    }
21}