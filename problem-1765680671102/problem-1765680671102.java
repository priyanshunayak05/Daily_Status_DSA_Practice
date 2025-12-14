// Last updated: 12/14/2025, 8:21:11 AM
1class Solution {
2    public String reverseWords(String s) {
3        String []word=s.split(" ");
4        if(word.length==0){
5            return "";
6        }
7        String fword=word[0];
8        int t=0;
9
10
11        for(char c:fword.toCharArray()){
12            if(c=='a'|| c=='e' || c=='i' || c=='o' ||c=='u'){
13                t++;
14            }
15        }
16
17        String [] res=new String [word.length];
18        res[0]=fword;
19
20        for(int i=1;i<word.length;i++){
21            String curr=word[i];
22            int currV=0;
23
24            for(char c:curr.toCharArray()){
25                if(c=='a' ||c=='e' || c=='i'||c=='o' ||c=='u'){
26                    currV++;
27                }
28            }
29
30            if(currV==t){
31                res[i]=new StringBuilder(curr).reverse().toString();
32            }
33            else{
34                res[i]=curr;
35            }
36        }
37        return String.join(" ",res);
38    }
39}