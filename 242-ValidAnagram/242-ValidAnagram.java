// Last updated: 8/1/2025, 1:56:58 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
			return false;
		}
		int[] charcount=new int[26];
		for(int i=0;i<t.length();i++) {
			charcount[s.charAt(i)-'a']++;
			charcount[t.charAt(i)-'a']--;
			
		}
		for(int count : charcount) {
			if(count!=0) {
				return false;
			}
		}
		return true;
    }
}