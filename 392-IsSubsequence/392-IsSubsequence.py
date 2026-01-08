# Last updated: 1/8/2026, 6:57:08 PM
1class Solution:
2    def isSubsequence(self, s: str, t: str) -> bool:
3        i=0
4        j=0
5        while i<len(s) and j<len(t):
6            if s[i]==t[j]:
7                i+=1
8            j+=1
9
10        return i==len(s)
11        