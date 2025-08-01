// Last updated: 8/1/2025, 1:55:07 PM
class Solution {
     public static int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(Check(words[i],words[j])){
                    c++;
                }
            }
        }

        return c;

    }
    public static boolean Check(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
