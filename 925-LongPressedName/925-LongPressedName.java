// Last updated: 12/20/2025, 6:12:03 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0, j = 0;
4
5        while (j < typed.length()) {
6            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
7                i++;
8                j++;
9            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
10                // long pressed character
11                j++;
12            } else {
13                return false;
14            }
15        }
16        // all characters in name must be matched
17        return i == name.length();
18    }
19}
20