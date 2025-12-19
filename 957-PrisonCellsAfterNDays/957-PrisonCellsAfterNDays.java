// Last updated: 12/19/2025, 6:21:22 PM
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int N) {
3        Map<String, Integer> seen = new HashMap<>();
4        boolean cycleFound = false;
5
6        while (N > 0) {
7            String key = Arrays.toString(cells);
8
9            if (seen.containsKey(key)) {
10                int cycleLength = seen.get(key) - N;
11                N %= cycleLength;
12                cycleFound = true;
13            }
14
15            if (N > 0) {
16                seen.put(key, N);
17                cells = nextDay(cells);
18                N--;
19            }
20        }
21        return cells;
22    }
23
24    private int[] nextDay(int[] cells) {
25        int[] next = new int[8];
26        for (int i = 1; i < 7; i++) {
27            next[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
28        }
29        return next;
30    }
31}
32