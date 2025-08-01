// Last updated: 8/1/2025, 1:55:11 PM
class Solution {
    public int minimumLength(String s) {
    int[]freq=new int[26];
		for(char c:s.toCharArray()) {
			freq[c-'a']++;
		}
		int len=0;
		for(int i=0;i<26;i++) {
			if(freq[i]%2!=0) {
				len +=1;
			}
			else {
				len +=Math.min(2, freq[i]);
			}
		}
		return len;
		
	}

}