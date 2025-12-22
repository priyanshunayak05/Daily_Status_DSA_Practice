// Last updated: 12/22/2025, 8:14:37 PM
1class Solution {
2    public String arrangeWords(String text) {
3        text = text.toLowerCase();
4
5        String[] words = text.split(" ");
6
7        java.util.Arrays.sort(words, (a, b) -> a.length() - b.length());
8
9        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
10
11        StringBuilder sb = new StringBuilder();
12        for (int i = 0; i < words.length; i++) {
13            sb.append(words[i]);
14            if (i < words.length - 1) sb.append(" ");
15        }
16
17        return sb.toString();
18    }
19}
20