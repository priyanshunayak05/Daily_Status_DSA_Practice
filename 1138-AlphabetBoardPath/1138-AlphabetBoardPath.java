// Last updated: 12/21/2025, 8:05:21 PM
1class Solution {
2    public String alphabetBoardPath(String target) {
3        StringBuilder sb = new StringBuilder();
4        int curRow = 0, curCol = 0;
5
6        for (char ch : target.toCharArray()) {
7            int newRow = (ch - 'a') / 5;
8            int newCol = (ch - 'a') % 5;
9
10            // Move UP first
11            while (curRow > newRow) {
12                sb.append('U');
13                curRow--;
14            }
15            // Move LEFT first
16            while (curCol > newCol) {
17                sb.append('L');
18                curCol--;
19            }
20            // Move DOWN
21            while (curRow < newRow) {
22                sb.append('D');
23                curRow++;
24            }
25            // Move RIGHT
26            while (curCol < newCol) {
27                sb.append('R');
28                curCol++;
29            }
30
31            sb.append('!');
32        }
33
34        return sb.toString();
35    }
36}
37