class Solution:
    def mirrorDistance(self, n: int) -> int:
        temp=n
        rev=0
        while n>0:
            x=n%10
            rev=rev*10+x
            n=n//10
        return abs(rev-temp)
        