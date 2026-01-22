// Last updated: 1/22/2026, 9:31:55 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int n=nums.length;
4        int[]left=new int[n];
5        left[0]=nums[0];
6
7        int right[]=new int[n];
8        right[n-1]=nums[n-1];
9
10        for(int i=1;i<n;i++){
11            left[i]=left[i-1]+nums[i];
12        }
13        for(int i=n-2;i>=0;i--){
14            right[i]=right[i+1]+nums[i];
15        }
16
17        int count=0;
18        for(int i=0;i<n-1;i++){
19            if(Math.abs(left[i]-right[i+1])%2==0){
20                count++;
21            }
22        }
23        return count;
24        
25    }
26}