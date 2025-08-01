// Last updated: 8/1/2025, 1:57:55 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<Integer>li=new ArrayList<>();
		List<List<Integer>>ans1=new ArrayList<>();
		ans1.add(new ArrayList<>());
		Print(nums,0,li,ans1);
		return ans1;
	}
	public static void Print(int nums[],int idx,List<Integer>li,List<List<Integer>>ans1) {
		if(idx==nums.length) {
			return;
		}
		for(int i=idx;i<nums.length;i++) {
		
			li.add(nums[i]);
			ans1.add(new ArrayList<>(li));
			Print(nums,i+1,li,ans1);
			li.remove(li.size()-1);
		}
	}

}
