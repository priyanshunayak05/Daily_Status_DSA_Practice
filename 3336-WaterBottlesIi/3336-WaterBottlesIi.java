// Last updated: 12/6/2025, 11:56:18 PM
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