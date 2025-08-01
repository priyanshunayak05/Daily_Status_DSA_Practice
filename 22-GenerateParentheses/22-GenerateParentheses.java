// Last updated: 8/1/2025, 1:58:34 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>l1=new ArrayList<>();
		Paranthesis(n,0,0,"",l1);
        return l1;
    }
    public static void Paranthesis(int n,int closed,int open,String ans,List<String>l1) {
		if(open ==n & closed==n) {
//			System.out.println(ans);
			l1.add(ans);
			
			return;
		}
		if(open >n || closed >open) {
			return;
		}
		
		Paranthesis(n,closed,open+1,ans+"(",l1);
		Paranthesis(n,closed+1,open,ans+")",l1);
	}
	

}
