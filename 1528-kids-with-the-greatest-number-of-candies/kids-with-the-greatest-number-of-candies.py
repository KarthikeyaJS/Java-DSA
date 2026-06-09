class Solution:
    def kidsWithCandies(self, nums: List[int], ext: int) -> List[bool]:
        m=max(nums)
        res=[]
        for i in nums:
            if i+ext>=m:
                res.append(True)
            else:
                res.append(False)
        return res