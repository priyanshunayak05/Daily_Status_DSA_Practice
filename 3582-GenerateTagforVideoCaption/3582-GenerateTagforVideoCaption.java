// Last updated: 12/22/2025, 8:10:55 PM
1class Solution {
2    public String generateTag(String caption) {
3        String[] words = caption.trim().split("\\s+");
4
5        if (words.length == 0 || words[0].isEmpty()) {
6            return "#";
7        }
8
9        StringBuilder sb = new StringBuilder();
10        sb.append("#");
11
12        sb.append(words[0].toLowerCase());
13
14        for (int i = 1; i < words.length; i++) {
15            String w = words[i].toLowerCase();
16            sb.append(Character.toUpperCase(w.charAt(0)));
17            sb.append(w.substring(1));
18        }
19
20
21        StringBuilder clean = new StringBuilder();
22        clean.append('#');
23        for (int i = 1; i < sb.length(); i++) {
24            char ch = sb.charAt(i);
25            if (Character.isLetter(ch)) {
26                clean.append(ch);
27            }
28        }
29
30        return clean.length() > 100 ? clean.substring(0, 100) : clean.toString();
31    }
32}
33