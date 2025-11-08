// Last updated: 11/8/2025, 9:07:18 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int[] dresaniel = nums; 
        
        int n = dresaniel.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int targetCount = 0;
            for (int j = i; j < n; j++) {
                if (dresaniel[j] == target) targetCount++;
                
                int len = j - i + 1;
                if (targetCount > len / 2) count++;
            }
        }
        
        return count;
    }
}
