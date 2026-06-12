class Solution:
    def thirdMax(self, arr: List[int]) -> int:
        m1,m2,m3=float('-inf'),float('-inf'),float('-inf')
        for i in arr:
            if i>m1:
                m3=m2
                m2=m1
                m1=i
            elif i>m2 and i!=m1:
                m3=m2
                m2=i
            elif i>m3 and i!=m1 and i!=m2:
                m3=i
        if m3!=float('-inf'):
            return m3
        return m1