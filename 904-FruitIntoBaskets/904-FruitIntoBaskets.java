// Last updated: 9/26/2025, 2:36:18 PM
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            if(map.size()>2){
                int y=fruits[j++];
                map.put(y,map.get(y)-1);
                if(map.get(y)==0){
                    map.remove(y);
                }
            }
        }
        return fruits.length-j;
    }
}