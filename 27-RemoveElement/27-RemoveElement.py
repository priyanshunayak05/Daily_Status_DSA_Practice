# Last updated: 1/22/2026, 8:54:41 PM
1class Solution:
2    def removeElement(self, nums: List[int], val: int) -> int:
3        j=0
4        for i in range (len (nums)):
5            if nums[i]!=val:
6                nums[j]=nums[i]
7                j+=1
8
9        return j
10        