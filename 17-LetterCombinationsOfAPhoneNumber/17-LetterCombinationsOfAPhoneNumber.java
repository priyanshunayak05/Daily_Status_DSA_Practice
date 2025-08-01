// Last updated: 8/1/2025, 1:58:41 PM
class Solution {
static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       List<String> l1=new ArrayList<>();
		if(digits.length()==0) {
			return l1;
		}
		// String ques="23";
		print(digits,"",l1); 
        return l1;
    }
    public static void print(String ques,String ans,List<String> l1) {
		if(ques.length()==0) {
//			System.out.println(ans);
			l1.add(ans);
			return;
		}
		char ch=ques.charAt(0);
		String getString=key[ch-'0'];
		for(int i=0;i<getString.length();i++) {
			print(ques.substring(1),ans+getString.charAt(i),l1);
		}
	}
}