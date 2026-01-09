// Last updated: 1/9/2026, 3:54:15 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3         int i=0;
4        int j=0;
5        while(j<nums.length){
6            if(nums[j]!=0){
7                int temp=nums[i];
8                nums[i]=nums[j];
9                nums[j]=temp;
10                i++;
11            }
12            j++;
13
14        }
15        
16    }
17}
18