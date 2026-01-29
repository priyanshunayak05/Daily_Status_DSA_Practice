// Last updated: 1/30/2026, 12:27:54 AM
1class MyCircularDeque {
2    int size;
3    int count=0;
4    Deque<Integer>dq;
5
6    public MyCircularDeque(int k) {
7        size=k;
8        dq=new ArrayDeque<>();
9        
10    }
11    
12    public boolean insertFront(int value) {
13        if(count==size)return false;
14        dq.addFirst(value);
15        count++;
16        return true;
17        
18    }
19    
20    public boolean insertLast(int value) {
21        if(count==size)return false;
22        dq.addLast(value);
23        count++;
24        return true;
25        
26    }
27    
28    public boolean deleteFront() {
29        if(count==0)return false;
30        dq.pollFirst();
31        count--;
32        return true;
33        
34    }
35    
36    public boolean deleteLast() {
37        if (count==0)return false;
38        dq.pollLast();
39        count--;
40        return true;
41        
42    }
43    
44    public int getFront() {
45        if(count==0) return -1;
46        return dq.getFirst();
47        
48    }
49    
50    public int getRear() {
51        if (count==0)return -1;
52        return dq.getLast();
53        
54    }
55    
56    public boolean isEmpty() {
57        
58        return count==0;
59        
60    }
61    
62    public boolean isFull() {
63        
64        return size==count;
65        
66    }
67}
68
69/**
70 * Your MyCircularDeque object will be instantiated and called as such:
71 * MyCircularDeque obj = new MyCircularDeque(k);
72 * boolean param_1 = obj.insertFront(value);
73 * boolean param_2 = obj.insertLast(value);
74 * boolean param_3 = obj.deleteFront();
75 * boolean param_4 = obj.deleteLast();
76 * int param_5 = obj.getFront();
77 * int param_6 = obj.getRear();
78 * boolean param_7 = obj.isEmpty();
79 * boolean param_8 = obj.isFull();
80 */