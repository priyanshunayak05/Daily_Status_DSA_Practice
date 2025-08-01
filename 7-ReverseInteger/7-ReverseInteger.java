// Last updated: 8/1/2025, 1:58:50 PM
class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int dig=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev== Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0;  // Overflow case for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev== Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0;  // Underflow case for negative numbers
            }
            
            rev=rev*10+dig;
            x /=10;
        }
        return rev;
    }
}