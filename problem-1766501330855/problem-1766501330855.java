// Last updated: 12/23/2025, 8:18:50 PM
1import java.util.*;
2
3class Solution {
4    public boolean closeStrings(String word1, String word2) {
5        if (word1.length() != word2.length()) return false;
6
7        int[] f1 = new int[26];
8        int[] f2 = new int[26];
9
10        for (char c : word1.toCharArray()) {
11            f1[c - 'a']++;
12        }
13        for (char c : word2.toCharArray()) {
14            f2[c - 'a']++;
15        }
16
17        // Condition 1: same characters must exist
18        for (int i = 0; i < 26; i++) {
19            if ((f1[i] == 0 && f2[i] != 0) || (f1[i] != 0 && f2[i] == 0)) {
20                return false;
21            }
22        }
23
24        // Condition 2: same frequency multiset
25        Arrays.sort(f1);
26        Arrays.sort(f2);
27
28        return Arrays.equals(f1, f2);
29    }
30}
31