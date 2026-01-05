// Last updated: 1/5/2026, 11:20:28 AM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String>ans=new ArrayList<>();
4        int n=groups.length;
5        ans.add(words[0]);
6        int prev=groups[0];
7        for(int i=1;i<n;i++){
8            if(groups[i]!=prev){
9                ans.add(words[i]);
10                prev=groups[i];
11            }            
12        }
13        return ans;
14
15    }
16}