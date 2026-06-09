class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        res=[]
        c=0
        for i in nums:
            if i==0:
                c=c+1
            else:
                res.append(i)
        while c>0:
            res.append(0)
            c=c-1
        for i in range(len(nums)):
            nums[i]=res[i]