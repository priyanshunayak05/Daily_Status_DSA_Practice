// Last updated: 12/20/2025, 8:47:13 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        long sc=0;
4        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
5        int n=nums.length;
6
7        for(int i=0;i<n;i++){
8            pq.add(nums[i]);
9            if(s.charAt(i)=='1'){
10                sc +=pq.poll();
11            }
12        }
13        return sc;
14    }
15}