// Last updated: 9/26/2025, 7:23:31 PM
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        // Handle the edge case where there are no balloons
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort the balloons by their end coordinates.
        // This is crucial for the greedy approach: by sorting by end,
        // we ensure that when we place an arrow, it extends as far right
        // as possible while still bursting the current balloon, maximizing
        // its potential to burst subsequent overlapping balloons.
        // Using a custom Comparator for 2D arrays.
        Arrays.sort(points, (a, b) -> {
            // It's important to use Long.compare for larger coordinate values
            // if coordinates can exceed Integer.MAX_VALUE when doing subtraction,
            // though for typical LeetCode constraints, Integer.compare is safe
            // and often preferred over (a[1] - b[1]) to prevent overflow.
            return Integer.compare(a[1], b[1]);
        });

        // Initialize the number of arrows needed. We need at least one
        // for the first balloon.
        int arrows = 1;
        
        // Initialize the position where the first arrow is shot.
        // This arrow is shot at the end coordinate of the first balloon.
        int currentArrowLimit = points[0][1];

        // Iterate through the rest of the balloons starting from the second one.
        for (int i = 1; i < points.length; i++) {
            int balloonStart = points[i][0];
            // int balloonEnd = points[i][1]; // Not strictly needed for the logic here, as limit is by previous end

            // If the current balloon's start coordinate is greater than
            // the position of our current arrow, it means this balloon
            // cannot be burst by the current arrow. A new arrow is required.
            if (balloonStart > currentArrowLimit) {
                arrows++;
                // Place the new arrow at the end of this current balloon.
                currentArrowLimit = points[i][1];
            }
            // Else (if balloonStart <= currentArrowLimit):
            // The current balloon's start coordinate is at or before the
            // position of our current arrow. This means the current balloon
            // overlaps with or touches the range covered by our existing arrow.
            // Since we sorted by end coordinates, and our arrow is at
            // currentArrowLimit, this balloon (points[i]) will be burst.
            // No new arrow is needed, and the currentArrowLimit remains
            // the same, continuing to cover as many subsequent balloons as possible.
        }

        return arrows;
    }
}