// Last updated: 9/10/2025, 9:24:55 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        List<Integer>ll=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                ll.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int [] ans=new int[ll.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ll.get(i);
        }
        return ans;
    }
}