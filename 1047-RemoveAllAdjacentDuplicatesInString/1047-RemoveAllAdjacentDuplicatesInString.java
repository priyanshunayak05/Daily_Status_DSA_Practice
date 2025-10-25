// Last updated: 10/25/2025, 10:29:16 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Integer>stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sb.length()>0 && sb.charAt (sb.length()-1)==ch){
                stack.push(stack.pop()+1);
            }
            else{
                stack.push(1);
            }
            sb.append(ch);

            if(stack.peek()==k){
                sb.delete(sb.length()-k,sb.length());
                stack.pop();
            }
        }


        return sb.toString();
    }
}