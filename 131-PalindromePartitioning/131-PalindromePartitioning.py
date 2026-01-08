# Last updated: 1/8/2026, 7:43:07 PM
1class Solution:
2    def partition(self, s: str) -> List[List[str]]:
3        temp=[]
4        lst=[]
5
6        self.part(s,temp,lst)
7        return lst
8
9    def part(self,s:str,temp:List[str],lst:List[List[str]]):
10
11        if len(s)==0:
12            lst.append(temp.copy())
13            return
14        
15        for cut in range(1,len(s)+1):
16            st=s[:cut]
17            if self.ispalind(st):
18                temp.append(st)
19                self.part(s[cut:],temp,lst)
20                temp.pop()
21    
22    def ispalind(self,st:str)->bool:
23        return st== st[::-1]
24        
25