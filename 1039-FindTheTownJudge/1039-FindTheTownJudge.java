// Last updated: 12/6/2025, 11:57:45 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int len=trust.length;
        int out[]=new int[n+1];
        int in[]=new int[n+1];

        for(int i=0;i<len;i++){
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }
        //find the judge
        for(int i=1;i<=n;i++){
            if(out[i]==0 && in[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}