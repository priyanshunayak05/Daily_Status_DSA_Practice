// Last updated: 12/20/2025, 9:01:28 PM
1class Solution {
2    public long lastInteger(long n) {
3        long h=1;
4        long step=1;
5        boolean l=true;
6
7        while(n>1){
8            if(!l && n%2==0){
9                h +=step;
10            }
11            step *=2;
12            n=(n+1)/2;
13            l=!l;
14        }
15        return h;
16    }
17}