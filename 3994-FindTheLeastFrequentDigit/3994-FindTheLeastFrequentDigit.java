// Last updated: 9/10/2025, 9:23:47 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
       int [] freq=new int[10];
        String s=String.valueOf(n);
        for(char ch: s.toCharArray()){
            freq[ch-'0']++;
        }
        int minfreq=Integer.MAX_VALUE;
        int result=-1;
        for(int digit=0;digit<=9;digit++){
            if(freq[digit]>0){
                if(freq[digit]<minfreq){
                    minfreq=freq[digit];
                    result=digit;
                }
            }
        }
        return result;
        
    }
}