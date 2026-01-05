// Last updated: 1/5/2026, 12:30:55 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if(num==0){
4            return 0;
5        }
6        for(int i=1;i<=10;i++){
7            if((i*k)%10==(num%10) && (i*k)<=num){
8                return i;
9            }
10        }
11        return -1;
12        
13    }
14}