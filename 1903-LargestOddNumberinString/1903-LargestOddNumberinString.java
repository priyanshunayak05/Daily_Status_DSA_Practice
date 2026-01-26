// Last updated: 1/27/2026, 12:01:43 AM
1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i=num.length()-1;i>=0;i--){
4
5            if((num.charAt(i)-'0')%2==1){
6
7                return num.substring(0,i+1);
8            }
9        }
10
11        return "";
12    }
13}