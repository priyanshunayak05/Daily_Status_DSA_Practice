// Last updated: 12/24/2025, 8:00:59 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
4        int lcp = 0;
5
6        for (int i = 0; i < minLen; i++) {
7            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
8                lcp++;
9            } else {
10                break;
11            }
12        }
13
14        if (lcp == 0) return -1;
15
16        return (s1.length() - lcp) + (s2.length() - lcp) + (s3.length() - lcp);
17    }
18}
19