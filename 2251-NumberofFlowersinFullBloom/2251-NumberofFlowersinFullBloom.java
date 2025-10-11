// Last updated: 10/11/2025, 9:11:00 PM
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=flowers.length;
        int[]start=new int[n];
        int []end=new int[n];

        for(int i=0;i<n;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[]answer=new int[people.length];

        for(int i=0;i<people.length;i++){
            int time=people[i];
            int started=upperbound(start,time);
            int ended=lowerbound(end,time);
            answer[i]=started-ended;

        }
        return answer;
        
    }
    public static int upperbound(int[] start,int target){
        int l=0;
        int r=start.length;

        while(l<r){
            int mid= l+(r-l)/2;
            if(start[mid]<=target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
     public static int lowerbound(int[] start,int target){
        int l=0;
        int r=start.length;

        while(l<r){
            int mid= l+(r-l)/2;
            if(start[mid]<target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}