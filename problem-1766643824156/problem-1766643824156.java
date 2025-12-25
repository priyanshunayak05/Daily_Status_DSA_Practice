// Last updated: 12/25/2025, 11:53:44 AM
1class Solution {
2    public int distMoney(int money, int children) {
3        if (money < children) return -1;   // everyone needs at least 1
4        
5        money -= children;                 // give each child 1 dollar
6        
7        int ans = Math.min(money / 7, children);
8        int rem = money - ans * 7;
9        
10        // Case: all children assigned 8 but still money left → not possible
11        if (ans == children && rem > 0) return ans - 1;
12        
13        // Case: remaining money would force exactly one child to become 4
14        if (rem == 3 && ans == children - 1) return ans - 1;
15        
16        return ans;
17    }
18}
19