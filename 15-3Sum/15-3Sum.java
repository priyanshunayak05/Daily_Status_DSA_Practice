// Last updated: 1/13/2026, 11:25:31 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Set<List<Integer>>set=new HashSet<>();
4        Arrays.sort(nums);
5        int n=nums.length;
6      
7    
8        for(int i=0;i<n-2;i++){
9            int j=i+1; int k=n-1;
10
11            while(j<k){
12                int sum=nums[i]+nums[j]+nums[k];
13                if(sum==0){
14                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
15                    j++;
16                    k--;
17                }
18                else if(sum<0){
19                    j++;
20                }
21                else{
22                    k--;
23                }
24            }
25            }
26            return new ArrayList<>(set);
27    }
28}