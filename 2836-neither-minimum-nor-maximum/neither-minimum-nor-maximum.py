class Solution:
    def findNonMinOrMax(self, arr: List[int]) -> int:
        m1=max(arr)
        m2=min(arr)
        for i in arr:
            if i!=m1 and i!=m2:
                return i
        return -1