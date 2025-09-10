// Last updated: 9/10/2025, 9:23:48 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
     long sumodd=(long) n*n;
     long sumeven=(long) n*(n+1);
     return gcd(sumodd,sumeven);
    }
    public int  gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return (int)a;
    }
}