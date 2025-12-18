// Last updated: 12/18/2025, 9:11:31 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while (left < right) {
8            int width = right - left;
9            int minHeight = Math.min(height[left], height[right]);
10            int area = width * minHeight;
11
12            maxArea = Math.max(maxArea, area);
13
14            // Move the pointer with smaller height
15            if (height[left] < height[right]) {
16                left++;
17            } else {
18                right--;
19            }
20        }
21        return maxArea;
22    }
23}
24