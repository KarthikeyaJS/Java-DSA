class Solution:
    def mergeAlternately(self, w1: str, w2: str) -> str:
        res=""
        i=0
        n=len(w1)
        m=len(w2)
        while i<n or i<m:
            if i<n:
                res=res+w1[i]
            if i<m:
                res=res+w2[i]
            i=i+1
        return res