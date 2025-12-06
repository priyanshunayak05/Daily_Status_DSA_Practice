// Last updated: 12/6/2025, 11:58:48 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>ans=new ArrayList<>();
        int []freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int wsize=p.length();
        for(int i=0;i<s.length();i++){
            int windx=0;
            int indx=i;
            int []freq2=new int[26];

            while(windx<wsize && indx<s.length()){
                freq2[s.charAt(indx)-'a']++;
                windx++;
                indx++;
            }
            if(ismatch(freq,freq2)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean ismatch(int []freq1,int []freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}