// Last updated: 12/23/2025, 8:15:53 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int left = 0, right = n - 1;
5
6        // Skip leading 'L'
7        while (left < n && directions.charAt(left) == 'L') {
8            left++;
9        }
10
11        // Skip trailing 'R'
12        while (right >= 0 && directions.charAt(right) == 'R') {
13            right--;
14        }
15
16        int collisions = 0;
17        for (int i = left; i <= right; i++) {
18            if (directions.charAt(i) != 'S') {
19                collisions++;
20            }
21        }
22
23        return collisions;
24    }
25}
26