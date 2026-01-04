// Last updated: 1/4/2026, 7:50:02 PM
1class Solution {
2    public String largestEven(String s) {
3        int idx=s.lastIndexOf('2');
4        if(idx==-1)return "";
5        return s.substring(0,idx+1);
6
7    }
8}