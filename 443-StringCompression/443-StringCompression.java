// Last updated: 8/1/2025, 1:56:24 PM
class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;
         while(i<chars.length){
            char current=chars[i];
            int count=0;
            while(i<chars.length && current==chars[i]){
                i++;
                count++;
            }
           chars[write++]=current;
            if(count>1){
                for(char c:Integer.toString(count).toCharArray()){
                    chars[write++]=c;
                }
            }
         }
         return write;
        
    }
}