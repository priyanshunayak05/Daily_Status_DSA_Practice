// Last updated: 10/21/2025, 4:19:52 PM
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder st=new StringBuilder();
        Stack<Character>stack=new Stack<>();
        

        for(char c:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }


        for(char ch:stack){
            st.append(ch);
        }

        while(st.length()>1 && st.charAt(0)=='0'){
            st.deleteCharAt(0);
        }
        return st.length()==0?"0":st.toString();
    }
}