// Last updated: 1/4/2026, 1:52:38 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        String repeat=word;
4        int c=0;
5        while(sequence.contains(repeat)){
6            c++;
7            repeat +=word;
8
9        }
10        return c;
11    }
12}