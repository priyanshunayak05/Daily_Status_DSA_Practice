// Last updated: 8/1/2025, 1:55:40 PM
class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && t-3000>queue.peek()){
            queue.poll();
        }
        return queue.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */