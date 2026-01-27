// Last updated: 1/27/2026, 2:29:29 PM
1class MyCircularQueue {
2    int size;
3    int cnt;
4    Queue<Integer> q;
5    public MyCircularQueue(int k) {
6        size=k;
7        cnt=0;
8        q=new LinkedList<>();  //to store data 
9    }
10    
11    public boolean enQueue(int value) {
12        if(cnt==size)return false;
13        cnt++;
14        q.add(value);
15        return true;
16    }
17    
18    public boolean deQueue() {
19        if(cnt==0) return false;
20        q.poll();
21        cnt--;
22        return true;
23    }
24    
25    public int Front() {
26        if(cnt==0) return -1;
27        return q.peek();
28    }
29    
30    public int Rear() {
31        if(cnt==0) return -1;
32        LinkedList<Integer> list = (LinkedList<Integer>) q;
33        return list.getLast();
34    }
35    
36    public boolean isEmpty() {
37        return cnt==0;
38    }
39    
40    public boolean isFull() {
41        return cnt==size;
42    }
43}
44
45/**
46 * Your MyCircularQueue object will be instantiated and called as such:
47 * MyCircularQueue obj = new MyCircularQueue(k);
48 * boolean param_1 = obj.enQueue(value);
49 * boolean param_2 = obj.deQueue();
50 * int param_3 = obj.Front();
51 * int param_4 = obj.Rear();
52 * boolean param_5 = obj.isEmpty();
53 * boolean param_6 = obj.isFull();
54 */