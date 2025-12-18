// Last updated: 12/18/2025, 11:04:06 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int f=first(nums,target);
4        int l=last(nums,target);
5        return new int[]{f,l};
6
7    }
8    public static int first(int []nums,int target){
9        int l=0;
10        int r=nums.length-1;
11        int index=-1;
12        while(l<=r){
13            int mid=l+(r-l)/2;
14
15              if(nums[mid]==target){
16                index=mid;
17            }
18            if(nums[mid]>=target){
19                r=mid-1;
20            }
21            else{
22                l=mid+1;
23            }
24          
25        }
26        return index;
27    }
28     public static int last(int []nums,int target){
29        int l=0;
30        int r=nums.length-1;
31        int index=-1;
32        while(l<=r){
33            int mid=l+(r-l)/2;
34
35                if(nums[mid]==target){
36                index=mid;
37            }
38            if(nums[mid]<=target){
39                l=mid+1;
40            }
41            else{
42                r=mid-1;
43            }
44        
45        }
46        return index;
47    }
48}