// Last updated: 12/6/2025, 11:57:56 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i=0;
        int c=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                c++;
                i++;
                j--;
            }
            else{
                j--;
                c++;
            }
        }
            
        return c;
    }
}