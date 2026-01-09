// Last updated: 1/9/2026, 7:54:19 PM
1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        int n=bloomDay.length;
4        if ((long)m*k >n)return -1;
5
6        int low=Integer.MAX_VALUE;
7        int high=0;
8        for(int i:bloomDay){
9            low=Math.min(low,i);
10            high=Math.max(high,i);
11        }
12
13        while(low<=high){
14            int mid=low+(high-low)/2;
15            if(canmake(bloomDay,mid,m,k)){
16                high=mid-1;
17            }
18            else{
19                low=mid+1;
20            }
21        }
22        return low;
23        
24    }
25    public static boolean canmake(int[] bloomDay,int day,int m,int k){
26        int bouq=0;
27        int flower=0;
28
29        for (int bloom:bloomDay){
30            if(bloom <=day){
31                flower++;
32                if (flower ==k){
33                    bouq++;
34                    flower=0;
35                }
36            }
37            else{
38                flower=0;
39            }
40        }
41        return bouq >=m;
42    }
43}