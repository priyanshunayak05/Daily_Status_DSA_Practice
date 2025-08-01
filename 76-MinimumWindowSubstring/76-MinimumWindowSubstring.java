// Last updated: 8/1/2025, 1:57:59 PM
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }

        // Map to store frequency of characters in t
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        // Sliding window variables
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;  // Start index of the minimum window substring
        int required = targetFreq.size();
        int formed = 0;

        // Map to store frequency of characters in the current window
        Map<Character, Integer> windowFreq = new HashMap<>();

        while (right < s.length()) {
            // Add character at right to the window
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            // Check if the current character meets the target frequency
            if (targetFreq.containsKey(c) && windowFreq.get(c).intValue() == targetFreq.get(c).intValue()) {
                formed++;
            }

            // Try to contract the window until it ceases to be 'valid'
            while (left <= right && formed == required) {
                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove the leftmost character from the window
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar).intValue() < targetFreq.get(leftChar).intValue()) {
                    formed--;
                }
                
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
