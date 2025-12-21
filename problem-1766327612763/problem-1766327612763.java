// Last updated: 12/21/2025, 8:03:32 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        return helper(s);
4    }
5
6    private String helper(String s) {
7        if (s.length() < 2) return "";
8
9        java.util.Set<Character> set = new java.util.HashSet<>();
10        for (char c : s.toCharArray()) set.add(c);
11
12        for (int i = 0; i < s.length(); i++) {
13            char c = s.charAt(i);
14            if (set.contains(Character.toLowerCase(c)) &&
15                set.contains(Character.toUpperCase(c))) {
16                continue;
17            }
18
19            String left = helper(s.substring(0, i));
20            String right = helper(s.substring(i + 1));
21
22            return left.length() >= right.length() ? left : right;
23        }
24
25        return s;
26    }
27}
28