// Last updated: 1/29/2026, 1:12:31 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int count=0;
4        for(int i=0;i<=nums.length-3;i++){
5
6            if(nums[i]==0){
7                for(int j=i;j<i+3;j++){
8                    nums[j]=1-nums[j];
9            }
10            count++;
11
12            }
13            
14        }
15
16        for(int n:nums){
17            if (n!=1){
18                return -1;
19            }
20        }
21        
22        return count;
23    }
24}