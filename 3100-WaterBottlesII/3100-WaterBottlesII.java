// Last updated: 11/15/2025, 3:08:14 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;

        while(empty>=numExchange){
            empty -=numExchange;
            total++;
            numExchange++;
            empty++;

        }
        return total;
    }
}