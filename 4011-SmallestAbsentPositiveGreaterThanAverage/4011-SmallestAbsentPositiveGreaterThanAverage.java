// Last updated: 12/6/2025, 11:56:04 PM
class Solution {
    public int smallestAbsent(int[] nums) {
       double sum = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            sum += num;
            numSet.add(num);
        }

        double avg = sum / nums.length;

        int candidate = (int) Math.floor(avg) + 1;
        if (candidate < 1) {
            candidate = 1;
        }

        while (numSet.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }
}