// Last updated: 10/22/2025, 6:44:29 PM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double [][]cars=new double[n][2];
        
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }

        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        int fleet=0;
        double prev=0;

        for(int i=0;i<n;i++){
            double time=(target-cars[i][0])/cars[i][1];
            if(time >prev){
                fleet++;
                prev=time;
            }

        }
        return fleet;
        
    }
}