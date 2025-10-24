// Last updated: 10/24/2025, 8:46:01 PM
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String currentString = "";
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentString);
                num = 0;
                currentString = "";
            } else if (c == ']') {
                int times = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < times; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            } else {
                currentString += c;
            }
        }

        return currentString;
    }
}
