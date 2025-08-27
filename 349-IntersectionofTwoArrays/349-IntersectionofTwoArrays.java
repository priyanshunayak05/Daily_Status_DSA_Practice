// Last updated: 8/27/2025, 7:55:21 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            map.add(nums1[i]);
        }
        List<Integer>ll=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                ll.add(nums2[i]);
                map.remove(nums2[i]);

            }
        }
        int ans[]=new int [ll.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ll.get(i);
            
        }
        return ans;
    }
}