// Last updated: 9/29/2025, 12:28:28 AM
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int l = 0, r = 0, idx = 0;

        while (r < n) {
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[r]) {
                dq.removeLast();
            }
            dq.addLast(r);

            if (!dq.isEmpty() && l > dq.getFirst()) {
                dq.removeFirst();
            }

            if (r + 1 >= k) {
                res[idx++] = nums[dq.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}