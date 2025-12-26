// Last updated: 12/26/2025, 10:48:12 PM
1class Solution {
2    public long minEnd(int n, int x) {
3        long ans = x;
4        long need = n - 1;      // we encode this into zero bits of x
5        long bit = 1;
6
7        while (need > 0) {
8            if ((ans & bit) == 0) {   // if bit not set in x
9                if ((need & 1) == 1)  ans |= bit;
10                need >>= 1;
11            }
12            bit <<= 1;
13        }
14        return ans;
15    }
16}
17