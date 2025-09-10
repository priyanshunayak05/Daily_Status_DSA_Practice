// Last updated: 9/10/2025, 9:24:57 PM
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