// Last updated: 1/1/2026, 7:43:16 PM
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
3        int n = friends.length;
4        boolean[] visited = new boolean[n];
5        Queue<Integer> q = new LinkedList<>();
6        
7        q.add(id);
8        visited[id] = true;
9        
10        int currentLevel = 0;
11        
12        while(!q.isEmpty()){
13            int size = q.size();
14            if(currentLevel == level) break;
15            
16            for(int i = 0; i < size; i++){
17                int person = q.poll();
18                
19                for(int f : friends[person]){
20                    if(!visited[f]){
21                        visited[f] = true;
22                        q.add(f);
23                    }
24                }
25            }
26            currentLevel++;
27        }
28        
29        // Now queue contains all people at given level
30        Map<String,Integer> freq = new HashMap<>();
31        
32        while(!q.isEmpty()){
33            int person = q.poll();
34            for(String video : watchedVideos.get(person)){
35                freq.put(video, freq.getOrDefault(video, 0) + 1);
36            }
37        }
38        
39        List<String> result = new ArrayList<>(freq.keySet());
40        
41        Collections.sort(result, (a,b) -> {
42            if(freq.get(a) != freq.get(b))
43                return freq.get(a) - freq.get(b);
44            return a.compareTo(b);
45        });
46        
47        return result;
48    }
49}
50