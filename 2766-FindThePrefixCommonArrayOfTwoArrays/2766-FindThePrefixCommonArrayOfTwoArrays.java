// Last updated: 8/1/2025, 1:55:09 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[]C=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<=i;j++){
                for(int k=0;k<=i;k++){
                    if(A[j]==B[k]){
                        c++;
                        break;
                    }
                }
            }
            C[i]=c;
        }
        return C;
    }
}