// Last updated: 12/20/2025, 8:40:16 PM
1class Solution {
2    public int maximumSum(int[] nums) {
3        Arrays.sort(nums);
4        List<Integer>l0=new ArrayList<>();
5        List<Integer>l1=new ArrayList<>();
6        List<Integer>l2=new ArrayList<>();
7
8        for(int i=nums.length-1;i>=0;i--){
9            int val=nums[i];
10            int r=val%3;
11            if(r==0 && l0.size()<3){
12                l0.add(val);
13            }
14            else if (r==1 && l1.size() <3){
15                l1.add(val);
16            }
17            else if (r==2 && l2.size()<3){
18                l2.add(val);
19            }
20        }
21
22            int ans=0;
23            if(l0.size()>=3){
24                ans=Math.max(ans,l0.get(0) + l0.get(1) +l0.get(2));
25            }
26            if(l1.size()>=3){
27                ans=Math.max(ans,l1.get(0) + l1.get(1) +l1.get(2));
28            }
29            if(l2.size()>=3){
30                ans=Math.max(ans,l2.get(0) + l2.get(1) +l2.get(2));
31            }
32
33            if(!l0.isEmpty() && !l1.isEmpty() && !l2.isEmpty()){
34                ans=Math.max(ans,l0.get(0) + l1.get(0) + l2.get(0));
35            }
36
37            return ans;
38    }
39}