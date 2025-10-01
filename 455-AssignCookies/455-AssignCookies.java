// Last updated: 10/1/2025, 5:03:50 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;

            }
            j++;
        }
        return i;
    }
}