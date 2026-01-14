// Last updated: 1/14/2026, 12:48:44 PM
1class Solution {
2    public int[] singleNumber(int[] arr) {
3        
4        int xor=0;
5        for(int i=0;i<arr.length;i++){
6            xor=xor^arr[i];
7        }
8        int mask=(xor & (-1 * xor));
9        int a=0;
10        for(int i=0;i<arr.length;i++){
11            if((mask & arr[i]) !=0){
12                a=a^arr[i];
13            }
14        }
15        int b=xor^a;
16        return new int[] {a,b};
17    }
18}