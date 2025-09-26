// Last updated: 9/26/2025, 9:06:20 PM
class Solution {
    public boolean canPlaceFlowers(int[] fls, int n) {
        int len=fls.length;
        int max=0;
        int fi=-1;
        int li=-1;
        for(int i=0;i<len;i++){
            if(fls[i]==0){
                continue;
            }
            else if(fi==-1){
                fi=i;
                li=i;
            }
            else{
                li=i;
            }
        }
        // all zero 
        if(fi==-1){
            max =(len+1)/2;
        }
        else{
            int first=fi;
            int last=len-1-li;
            max =first/2;
            max +=last/2;


            //middle
            int count=0;
            for(int i=fi+1;i<=li-1;i++){
                if(fls[i]==0){
                    count++;
                }
                else{
                    max +=(count-1)/2;
                    count=0;
                }
            }
            max +=(count-1)/2;
        }
        return n<=max;
    }
}