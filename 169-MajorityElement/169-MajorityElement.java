// Last updated: 8/1/2025, 1:57:24 PM
class Solution {
    public int majorityElement(int[] nums) {
        return(main(nums));
    }
    public static int main(int []arr){
        int n=arr.length;
        int e=arr[0];
        int v=1;
        for(int i=1;i<n;i++){
            
            if(arr[i]==e){
                v++;
            }
            else{
                v--;
            
                if(v==0){
                    e=arr[i];
                    v=1;
                    }
            }

        }
        return e;
    }
}