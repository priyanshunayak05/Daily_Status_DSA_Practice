# Last updated: 1/7/2026, 8:26:10 PM
1class Solution:
2    def removeDuplicates(self, nums: List[int]) -> int:
3        k=1
4
5        if not nums:
6            return 0
7
8        for i in range(1,len(nums)):
9            if nums[i]!=nums[i-1]:
10                nums[k]=nums[i]
11                k+=1
12
13        return k
14            
15        