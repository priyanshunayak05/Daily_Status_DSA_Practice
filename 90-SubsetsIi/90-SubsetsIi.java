// Last updated: 8/1/2025, 1:57:48 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<Integer>li=new ArrayList<>();
		List<List<Integer>>ans1=new ArrayList<>();
		ans1.add(new ArrayList<>());
        Arrays.sort(nums);
		Print(nums,0,li,ans1);
		return ans1;
	}
	public static void Print(int nums[],int idx,List<Integer>li,List<List<Integer>>ans1) {
		if(idx==nums.length) {
			return;
		}
		for(int i=idx;i<nums.length;i++) {
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
			li.add(nums[i]);
			ans1.add(new ArrayList<>(li));
			Print(nums,i+1,li,ans1);
			li.remove(li.size()-1);
		}
	}

}
