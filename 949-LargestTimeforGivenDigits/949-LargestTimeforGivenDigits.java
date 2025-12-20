// Last updated: 12/20/2025, 6:32:44 PM
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        int maxTime = -1;
4
5        // Try all permutations
6        for (int i = 0; i < 4; i++) {
7            for (int j = 0; j < 4; j++) {
8                if (j == i) continue;
9                for (int k = 0; k < 4; k++) {
10                    if (k == i || k == j) continue;
11                    for (int l = 0; l < 4; l++) {
12                        if (l == i || l == j || l == k) continue;
13
14                        int hour = arr[i] * 10 + arr[j];
15                        int minute = arr[k] * 10 + arr[l];
16
17                        if (hour < 24 && minute < 60) {
18                            int totalMinutes = hour * 60 + minute;
19                            maxTime = Math.max(maxTime, totalMinutes);
20                        }
21                    }
22                }
23            }
24        }
25
26        if (maxTime == -1) return "";
27
28        int hour = maxTime / 60;
29        int minute = maxTime % 60;
30
31        return String.format("%02d:%02d", hour, minute);
32    }
33}
34