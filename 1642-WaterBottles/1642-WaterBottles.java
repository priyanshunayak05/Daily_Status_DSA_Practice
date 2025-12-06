// Last updated: 12/6/2025, 11:56:42 PM
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