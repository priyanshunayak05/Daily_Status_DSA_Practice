// Last updated: 8/1/2025, 1:56:11 PM
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixCount = new HashMap<>();
        
        // Initialize with prefix sum of 0 having one count
        prefixCount.put(0, 1);
        
        for (int num : nums) {
            // Update the prefix sum
            prefixSum += num;
            
            // Check if there exists a prefix sum that, when subtracted from current, equals k
            if (prefixCount.containsKey(prefixSum - k)) {
                count += prefixCount.get(prefixSum - k);
            }
            
            // Add the current prefix sum to the map
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
