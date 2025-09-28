// Last updated: 9/28/2025, 12:19:23 PM
class Solution {
    public String frequencySort(String s) {
        
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<>();

        // to char Array
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        // sort by frequency
        List<Character>chars=new ArrayList<>(map.keySet());
        chars.sort((a,b) -> map.get(b)-map.get(a));

        // string builder
        for(char c:chars){
            int freq=map.get(c);
            for(int i=0;i<freq;i++){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}