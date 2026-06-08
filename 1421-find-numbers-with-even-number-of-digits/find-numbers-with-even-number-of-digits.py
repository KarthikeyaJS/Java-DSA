class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        c=0
        for i in nums:
            x=(int)(math.log10(i))+1
            if not x&1:
                c=c+1
        return c