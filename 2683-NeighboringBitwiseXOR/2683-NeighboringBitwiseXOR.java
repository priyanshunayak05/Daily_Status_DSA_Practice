// Last updated: 1/21/2026, 12:38:59 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int set_bit=0;
4        while(num2>0){
5            num2=(num2&(num2-1));
6            set_bit++;
7        }
8        int x=0;
9        for(int i=30;i>=0;i--){
10            int mask=(1<<i);
11            if((num1 & mask)!=0){
12                x|=mask;
13                set_bit--;
14                if(set_bit==0){
15
16                    return x;
17                }
18            }
19        }
20
21            for(int i=0;i<=30;i++){
22                int mask=(1 <<i);
23                if((num1 & mask)==0){
24                    x|=mask;
25                    set_bit --;
26                    if(set_bit==0){
27                        return x;
28                    }
29                }
30            }
31            return x;
32        
33    }
34}