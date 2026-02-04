// Last updated: 2/4/2026, 12:28:10 PM
1public class Trie {
2    class Node{
3        char ch;
4        boolean isterminal;
5        HashMap<Character,Node>child;
6        public Node (char ch){
7            this.ch=ch;
8            child=new HashMap<>();
9
10        }
11    }
12    private Node root;
13    public Trie(){
14        root=new Node('*');
15        
16    }
17    public void insert(String word){
18        Node curr=root;
19        for(int i=0;i<word.length();i++){
20            char ch=word.charAt(i);
21            if(curr.child.containsKey(ch)){
22                curr=curr.child.get(ch);
23            }
24            else{
25                Node nn=new Node(ch);
26                curr.child.put(ch,nn);
27                curr=nn;
28            }
29        }
30        curr.isterminal=true;
31    }
32    public boolean search(String word) {
33        Node curr=root;
34        for(int i=0;i<word.length();i++){
35            char ch=word.charAt(i);
36            if(curr.child.containsKey(ch)){
37                curr=curr.child.get(ch);
38            }
39            else{
40                return false;
41            }
42        }
43        return curr.isterminal;
44        
45    }
46    public boolean startsWith(String prefix) {
47            Node curr=root;
48        for(int i=0;i<prefix.length();i++){
49            char ch=prefix.charAt(i);
50            if(curr.child.containsKey(ch)){
51                curr=curr.child.get(ch);
52            }
53            else{
54                return false;
55            }
56        }
57        return true;
58        
59        
60    }
61    
62}
63
64
65/**
66 * Your Trie object will be instantiated and called as such:
67 * Trie obj = new Trie();
68 * obj.insert(word);
69 * boolean param_2 = obj.search(word);
70 * boolean param_3 = obj.startsWith(prefix);
71 */