// Last updated: 9/10/2025, 9:23:49 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        
        int[] l = nums.clone();
        
        if (nums.length % k != 0) {
            return false;
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int groups = nums.length / k;
        
        for (int count : freq.values()) {
            if (count > groups) {
                return false;
            }
        }
        
        return true;
    }
}