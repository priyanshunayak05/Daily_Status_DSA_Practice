// Last updated: 10/31/2025, 7:03:43 PM
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