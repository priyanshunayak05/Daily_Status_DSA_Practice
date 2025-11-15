// Last updated: 11/15/2025, 3:02:51 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int empty=numBottles;
        int total=numBottles;

        while(empty>=numExchange){
            empty -=numExchange;
            total++;
            empty++;

        }

        return total;
        
        
    }
}