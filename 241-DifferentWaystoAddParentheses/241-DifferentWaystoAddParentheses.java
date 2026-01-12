// Last updated: 1/12/2026, 9:27:20 PM
1class Solution {
2    public List<Integer> diffWaysToCompute(String expression) {
3        Map<String,List<Integer>>mp=new HashMap<>();
4
5        if(mp.containsKey(expression)){
6            return mp.get(expression);
7        }
8
9        List<Integer>result=new ArrayList<>();
10        for(int i=0;i<expression.length();i++){
11            char ch=expression.charAt(i);
12
13            if(ch=='+' ||ch=='-'|| ch=='*'){
14                String left=expression.substring(0,i);
15                String right=expression.substring(i+1);
16
17                List<Integer>lst=diffWaysToCompute(left);
18                List<Integer>rst=diffWaysToCompute(right);
19
20                for(int l:lst){
21                    for(int r:rst){
22                        if(ch=='+'){
23                            result.add(l+r);
24                        }
25                        else if(ch=='-'){
26                            result.add(l-r);
27                        }
28                        else{
29                            result.add(l*r);
30                        }
31                    }
32                }
33            }
34        }
35        if(result.isEmpty()){
36            result.add(Integer.parseInt(expression));
37        }
38        mp.put(expression,result);
39        return result;
40        
41    }
42}