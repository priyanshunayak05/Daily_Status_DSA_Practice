// Last updated: 2/5/2026, 12:26:15 PM
1class Solution {
2    public List<String> invalidTransactions(String[] transactions) {
3        int n=transactions.length;
4
5        String []name=new String[n];
6        int[]time=new int[n];
7        int []amt=new int[n];
8        String[]city=new String[n];
9
10        boolean[]invalid=new boolean[n];
11
12        for(int i=0;i<n;i++){
13            String[]parts=transactions[i].split(",");
14            name[i]=parts[0];
15            time[i]=Integer.parseInt(parts[1]);
16            amt[i]=Integer.parseInt(parts[2]);
17            city[i]=parts[3];
18
19
20
21            if(amt[i]>1000){
22                invalid[i]=true;
23            }
24        }
25        for(int i=0;i<n;i++){
26            for(int j=i+1;j<n;j++){
27                if(name[i].equals(name[j])){
28                    if(!city[i].equals(city[j])){
29                        if(Math.abs(time[i]-time[j])<=60){
30                            invalid[i]=true;
31                            invalid[j]=true;
32                        }
33                    }
34                }
35            }
36        }
37        List<String>res=new ArrayList<>();
38        for(int i=0;i<n;i++){
39            if(invalid[i]){
40                res.add(transactions[i]);
41            }
42        }
43        return res;
44    }
45}