// Last updated: 8/1/2025, 1:55:53 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    public static String check(String str){
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
              
                }
                else{
                    stack.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:stack){
            res.append(c);
        }
        return res.toString();
    }

}