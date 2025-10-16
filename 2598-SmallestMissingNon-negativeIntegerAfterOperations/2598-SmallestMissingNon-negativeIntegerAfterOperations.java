// Last updated: 10/16/2025, 11:55:15 PM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int MEX=0;
    for(int num:nums){
        int r=((num%value)+value)%value;
            map.put(r,map.getOrDefault(r,0)+1);
    }

    while(map.getOrDefault(MEX %value,0)>0){
        map.put(MEX %value,map.get(MEX %value)-1);
        MEX++;
    }

    return MEX;


    }
}