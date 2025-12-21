// Last updated: 12/21/2025, 8:27:53 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = indices.length;
4        int[] match = new int[s.length()];
5        Arrays.fill(match, -1);
6
7        // Step 1: mark valid replacements
8        for (int i = 0; i < n; i++) {
9            int idx = indices[i];
10            if (s.startsWith(sources[i], idx)) {
11                match[idx] = i;
12            }
13        }
14
15        // Step 2: build result
16        StringBuilder sb = new StringBuilder();
17        int i = 0;
18
19        while (i < s.length()) {
20            if (match[i] != -1) {
21                sb.append(targets[match[i]]);
22                i += sources[match[i]].length();
23            } else {
24                sb.append(s.charAt(i));
25                i++;
26            }
27        }
28
29        return sb.toString();
30    }
31}
32