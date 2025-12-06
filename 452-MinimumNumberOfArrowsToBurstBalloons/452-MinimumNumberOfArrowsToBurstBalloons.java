// Last updated: 12/6/2025, 11:58:43 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null||points.length ==0 ){
            return 0;
        }
        int n=points.length;
         Arrays.sort(points,(a, b) -> Integer.compare(a[1], b[1]));
         int arrow=1;
         int current_arrow=points[0][1];

         for(int i=1;i<n;i++){
            int Xstart=points[i][0];
            if(Xstart > current_arrow){
                arrow +=1;
                current_arrow=points[i][1];
            }

         }
         return arrow;
    }
}