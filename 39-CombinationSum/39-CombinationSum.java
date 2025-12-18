// Last updated: 12/18/2025, 11:04:35 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] coin, int target) {
3        List<List<Integer>>ans=new ArrayList<>();
4		List<Integer>li=new ArrayList<>();
5		Combination(coin,target,li,0,ans);
6		return ans;
7    }
8    public static void Combination(int []coin,int amount,List<Integer>li,int idx,List<List<Integer>>ans) {
9		if(amount==0) {
10//			System.out.println(li);
11			ans.add(new ArrayList<>(li));
12			return;
13		}
14		for(int i=idx;i<coin.length;i++) {
15			if(amount >=coin[i]) {
16				li.add(coin[i]);
17				Combination(coin,amount-coin[i],li,i,ans);
18				li.remove(li.size()-1);
19			}
20		}
21	}
22	
23
24}
25