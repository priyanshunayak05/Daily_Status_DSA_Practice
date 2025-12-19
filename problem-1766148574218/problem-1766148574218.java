// Last updated: 12/19/2025, 6:19:34 PM
1import java.util.*;
2
3class Solution {
4    public String longestWord(String[] words) {
5        Arrays.sort(words);
6        HashSet<String> set = new HashSet<>();
7        String result = "";
8
9        for (String word : words) {
10            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
11                set.add(word);
12
13                if (word.length() > result.length()) {
14                    result = word;
15                }
16            }
17        }
18        return result;
19    }
20}
21