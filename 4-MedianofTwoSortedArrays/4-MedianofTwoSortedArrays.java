// Last updated: 12/18/2025, 11:03:45 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int []arr=new int[nums1.length+nums2.length];
4        for(int i=0;i<nums1.length;i++){
5            arr[i]=nums1[i];
6        }
7        for(int i=0;i<nums2.length;i++){
8            arr[nums1.length+i]=nums2[i];
9        }
10        Arrays.sort(arr);
11        if((arr.length)%2==0){
12            return (double)(arr[arr.length/2] +arr[(arr.length/2)-1])/2;
13        }
14
15        return (double) (arr[arr.length/2]);
16
17    }
18}