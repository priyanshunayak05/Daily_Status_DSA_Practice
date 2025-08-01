// Last updated: 8/1/2025, 1:55:42 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res=new ArrayList<String>();
        int max_freq[]=new int[26];
        for(String word:words2){
            int []freq=count_freq(word);
            for(int i=0;i<26;i++){
                max_freq[i]=Math.max(freq[i],max_freq[i]);
            }
        }
       
        for(String word:words1){
            int freq[]=count_freq(word);
             boolean universe=true;
            for(int i=0;i<26;i++){
                if(freq[i]<max_freq[i]){
                    universe=false;
                    break;
                }
            }
            if(universe){
                res.add(word);
            }
        }

      return res;
        
    }
    public static int[] count_freq(String word){
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        return freq;
    }
}