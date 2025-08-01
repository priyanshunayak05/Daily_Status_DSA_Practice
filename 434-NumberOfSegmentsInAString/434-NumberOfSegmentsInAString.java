// Last updated: 8/1/2025, 1:56:27 PM
class Solution {
    public int countSegments(String s) {
    if(s==null || s.trim().isEmpty()) {
			return 0;
		}
		String[]segment =s.trim().split("\\s+");
		return segment.length;
		
	}
}