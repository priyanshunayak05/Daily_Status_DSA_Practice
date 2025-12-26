// Last updated: 12/26/2025, 10:41:40 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int i = 0, j = 0;
4
5        while (i < nums1.length && j < nums2.length) {
6            if (nums1[i] == nums2[j]) {
7                return nums1[i];  // first common (minimum)
8            } 
9            else if (nums1[i] < nums2[j]) {
10                i++;
11            } 
12            else {
13                j++;
14            }
15        }
16
17        return -1; // no common element
18    }
19}
20