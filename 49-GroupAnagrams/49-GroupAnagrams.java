// Last updated: 10/6/2025, 11:52:02 PM
class StockSpanner {
    List<Integer> prices;

    public StockSpanner() {
        prices = new ArrayList<>();
    }

    public int next(int price) {
        prices.add(price);
        int span = 1;
        int i = prices.size() - 2;

        // Count backward until a price > current price
        while (i >= 0 && prices.get(i) <= price) {
            span++;
            i--;
        }
        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */