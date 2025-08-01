// Last updated: 8/1/2025, 1:58:20 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int target) {
        List<List<Integer>>ans=new ArrayList<>();
		List<Integer>li=new ArrayList<>();
		Combination(coin,target,li,0,ans);
		return ans;
    }
    public static void Combination(int []coin,int amount,List<Integer>li,int idx,List<List<Integer>>ans) {
		if(amount==0) {
//			System.out.println(li);
			ans.add(new ArrayList<>(li));
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount >=coin[i]) {
				li.add(coin[i]);
				Combination(coin,amount-coin[i],li,i,ans);
				li.remove(li.size()-1);
			}
		}
	}
	

}
