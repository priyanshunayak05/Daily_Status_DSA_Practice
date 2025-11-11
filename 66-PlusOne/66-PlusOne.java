// Last updated: 11/11/2025, 11:29:35 PM
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int []res=new int[n+1];
        res[0]=1;
        return res;
        
    }
}