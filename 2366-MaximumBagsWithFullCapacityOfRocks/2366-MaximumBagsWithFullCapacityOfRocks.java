// Last updated: 12/6/2025, 11:56:28 PM
class Solution {
    public int maximumBags(int[] cap, int[] r, int a) {
        int n=r.length;
        int []diff=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            diff[i]=cap[i]-r[i];
        }
        Arrays.sort(diff);
        for(int i=0;i<n;i++){
            if(diff[i]==0){
                c++;
            }
            else if(a>=diff[i]){
                a-=diff[i];
                c++;
            }
            else{
                break;
            }
        }
        return c;
        
    }
}