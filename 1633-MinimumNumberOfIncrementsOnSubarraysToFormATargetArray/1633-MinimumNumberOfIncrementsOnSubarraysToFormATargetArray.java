// Last updated: 12/6/2025, 11:56:44 PM
class Solution {
    public int minNumberOperations(int[] target) {
        int a=target[0];
        for(int i=1;i<target.length;i++){
            if(target[i]>target[i-1]){
                a +=target[i]-target[i-1];
            }
        }
        return a;
        
    }
}