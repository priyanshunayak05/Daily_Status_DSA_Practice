// Last updated: 1/17/2026, 3:11:02 PM
1class Solution {
2    public String countOfAtoms(String formula) {
3        int n=formula.length();
4        Stack<Map<String,Integer>>stack=new Stack<>();
5        stack.push(new HashMap<>());
6
7        int i=0;
8        while(i<n){
9            char ch=formula.charAt(i);
10
11            if(ch=='('){
12                stack.push(new HashMap<>());
13                i++;
14            }
15            else if(ch==')'){
16                i++;
17                int multi=0;
18                while(i<n && Character.isDigit(formula.charAt(i))){
19                    multi=multi*10+(formula.charAt(i)-'0');
20                    i++;
21                }
22
23                if(multi==0) multi=1;
24
25            Map<String,Integer>top=stack.pop();
26            Map<String,Integer>parent=stack.peek();
27
28            for(String atom:top.keySet()){
29                parent.put(atom,parent.getOrDefault(atom,0)+top.get(atom)*multi);
30            }
31            }
32
33            else{
34                //atom name
35                StringBuilder atomname=new StringBuilder();
36                atomname.append(ch);
37                i++;
38                while(i<n && Character.isLowerCase(formula.charAt(i))){
39                    atomname.append(formula.charAt(i));
40                    i++;
41                }
42                int count=0;
43                while(i<n && Character.isDigit(formula.charAt(i))){
44                 count =count*10+(formula.charAt(i)-'0');   
45                 i++;
46                }
47                if(count==0) count=1;
48
49                stack.peek().put(atomname.toString(),stack.peek().getOrDefault(atomname.toString(),0)+count);
50            }
51
52
53        }
54        TreeMap<String,Integer>sorted=new TreeMap<>(stack.peek());
55        StringBuilder res=new StringBuilder();
56        for(String atom:sorted.keySet()){
57            res.append(atom);
58            int c=sorted.get(atom);
59            if(c>1){
60                res.append(c);
61            }
62        }
63        return res.toString();
64    }
65}