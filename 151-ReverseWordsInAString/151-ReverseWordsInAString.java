// Last updated: 8/1/2025, 1:57:28 PM
class Solution {
    public String reverseWords(String s) {
        // String s=" the sky is blue";
        s=s.trim();
		String []arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans =ans +arr[i]+" ";
		}
		return ans.trim();
	
    }
}