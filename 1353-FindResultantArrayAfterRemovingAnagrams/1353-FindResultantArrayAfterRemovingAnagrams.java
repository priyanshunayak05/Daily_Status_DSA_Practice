// Last updated: 12/6/2025, 11:56:55 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>ll=new ArrayList<>();
        ll.add(words[0]);

        for(int i=1;i<words.length;i++){
            String last=ll.get(ll.size()-1);
            if(!isAnagram(last,words[i])){
                ll.add(words[i]);
                
                
            }
        }
        return ll;
        
    }
    public static boolean isAnagram(String s, String s2){

        if(s.length()!=s2.length()){
            return false;

        }
        char []c1=s.toCharArray();
        char []c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}