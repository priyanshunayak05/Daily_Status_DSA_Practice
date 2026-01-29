// Last updated: 1/29/2026, 12:38:34 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        ArrayList<Integer>ls=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            ls.add(i);
6        }
7
8        int idx=0;
9        while(ls.size()>1){
10            idx=(idx+k-1)%ls.size();
11            ls.remove(idx);
12        }
13        return ls.get(0);
14    }
15}