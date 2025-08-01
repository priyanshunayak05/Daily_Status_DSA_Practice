// Last updated: 8/1/2025, 1:55:28 PM
class Solution {
    public boolean canBeValid(String s, String locked) {
        
        if (s.length() % 2 != 0) return false;

        int minOpen = 0, maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char lock = locked.charAt(i);

            if (lock == '1') { 
                if (ch == '(') {
                    minOpen++;
                    maxOpen++;
                } else {
                    minOpen--;
                    maxOpen--;
                }
            } else { 
                minOpen--; 
                maxOpen++; 
            }
            minOpen = Math.max(0, minOpen);

            if (maxOpen < 0) return false;
        }


        minOpen = 0;
        maxOpen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            char lock = locked.charAt(i);

            if (lock == '1') { 
                if (ch == ')') {
                    minOpen++;
                    maxOpen++;
                } else { 
                    minOpen--;
                    maxOpen--;
                }
            } else { 
                minOpen--; 
                maxOpen++; 
            }
            minOpen = Math.max(0, minOpen);

            if (maxOpen < 0) return false;
        }
        return minOpen == 0;
    }
}
