// Last updated: 8/1/2025, 1:55:37 PM
class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
    //    int f1=fib(n-1);
    //    int f2=fib(n-2);
    //     return f1+f2;
    int a=0;
    int b=1;
    int c=0;
    for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
        }
        return c;
    }
}