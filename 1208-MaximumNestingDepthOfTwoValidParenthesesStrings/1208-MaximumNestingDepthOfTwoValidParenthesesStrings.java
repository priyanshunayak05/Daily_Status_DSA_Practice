// Last updated: 8/1/2025, 1:55:34 PM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] result=new int[n];
        int dept=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                dept++;
                result[i]=dept%2;
            }
            else{
                result[i]=dept%2;
                dept--;
            }
        }
        return result;
    }
}