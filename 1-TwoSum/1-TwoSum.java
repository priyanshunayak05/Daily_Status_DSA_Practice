// Last updated: 12/18/2025, 11:01:35 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=i+1;j<nums.length;j++){
5                if(nums[i]+nums[j]==target){
6                return new int [] {i,j};
7
8
9            }
10            
11            }
12         
13        }
14        return new int[]{};
15    }
16    
17    }
18