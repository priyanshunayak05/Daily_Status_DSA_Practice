// Last updated: 12/23/2025, 8:12:46 PM
1class Solution {
2    public String smallestString(String s) {
3        char[] arr = s.toCharArray();
4        int n = arr.length;
5
6        int i = 0;
7        // Find first non-'a'
8        while (i < n && arr[i] == 'a') {
9            i++;
10        }
11
12        // If all characters are 'a'
13        if (i == n) {
14            arr[n - 1] = 'z';
15            return new String(arr);
16        }
17
18        // Decrease characters until we hit 'a'
19        while (i < n && arr[i] != 'a') {
20            arr[i]--;
21            i++;
22        }
23
24        return new String(arr);
25    }
26}
27