// Last updated: 1/27/2026, 2:43:41 PM
1class MyCircularQueue {
2    int size;
3    int count;
4    Queue<Integer>q;
5
6    public MyCircularQueue(int k) {
7        size=k;
8        count=0;
9        q=new LinkedList<>();
10        
11    }
12    
13    public boolean enQueue(int value) {
14        if(count==size)return false;
15        count++;
16        q.add(value);
17        return true;
18        
19    }
20    
21    public boolean deQueue() {
22        if(count==0){
23            return false;
24        }
25        count--;
26        q.poll();
27        return true;
28        
29    }
30    
31    public int Front() {
32        if(count==0)return -1;
33
34        return q.peek();
35        
36    }
37    
38    public int Rear() {
39        if (count==0)return -1;
40        LinkedList<Integer> list = (LinkedList<Integer>) q;
41        return list.getLast();
42
43        
44    }
45    
46    public boolean isEmpty() {
47        return count==0;
48        
49    }
50    
51    public boolean isFull() {
52        return count==size;
53
54
55        
56    }
57}
58
59/**
60 * Your MyCircularQueue object will be instantiated and called as such:
61 * MyCircularQueue obj = new MyCircularQueue(k);
62 * boolean param_1 = obj.enQueue(value);
63 * boolean param_2 = obj.deQueue();
64 * int param_3 = obj.Front();
65 * int param_4 = obj.Rear();
66 * boolean param_5 = obj.isEmpty();
67 * boolean param_6 = obj.isFull();
68 */