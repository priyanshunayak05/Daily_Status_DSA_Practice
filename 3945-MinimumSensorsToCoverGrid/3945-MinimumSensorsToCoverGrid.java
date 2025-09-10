// Last updated: 9/10/2025, 9:23:52 PM
class Solution {
    public int minSensors(int n, int m, int k) {
         int block = 2 * k + 1;
        int rows = (n + block - 1) / block;  // ceil(n / block)
        int cols = (m + block - 1) / block;  // ceil(m / block)
        return rows * cols;
    }
}