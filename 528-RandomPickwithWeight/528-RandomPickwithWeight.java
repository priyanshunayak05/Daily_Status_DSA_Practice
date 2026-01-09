// Last updated: 1/9/2026, 6:28:30 PM
1class Solution {
2    int[]prefix;
3    int total=0;
4    Random rand;
5
6    public Solution(int[] w) {
7        prefix=new int[w.length];
8        for(int i=0;i<w.length;i++){
9            total +=w[i];
10            prefix[i]=total;
11        }
12        rand=new Random();
13        
14    }
15    
16    public int pickIndex() {
17        int t=rand.nextInt(total)+1;
18        int l=0;
19        int h=prefix.length-1;
20        while(l<h){
21            int mid=l+(h-l)/2;
22            if(prefix[mid]<t){
23                l=mid+1;
24            }
25            else{
26                h=mid;
27            }
28        }
29        return l;
30
31        
32    }
33}
34
35/**
36 * Your Solution object will be instantiated and called as such:
37 * Solution obj = new Solution(w);
38 * int param_1 = obj.pickIndex();
39 */