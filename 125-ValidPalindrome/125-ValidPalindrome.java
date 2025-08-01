// Last updated: 8/1/2025, 1:57:42 PM
class Solution {
    public boolean isPalindrome(String s) {
  String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int i=0;
		int j=clean.length()-1;
		while(i<j) {
			if(clean.charAt(i)!=clean.charAt(j)) {
				return false;
			}
				i++;
				j--;
			}
		return true;
		
}

	}
