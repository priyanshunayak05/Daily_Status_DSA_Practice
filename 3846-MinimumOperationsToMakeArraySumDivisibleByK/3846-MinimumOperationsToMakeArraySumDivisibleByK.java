// Last updated: 12/6/2025, 11:56:12 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for( int n:nums){
            sum +=n;
        }
        return sum%k;
        
    }
}