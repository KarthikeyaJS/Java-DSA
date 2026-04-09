class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n=len(nums)
        left=0
        total=0
        length=float('inf')
        for right in range(n):
            total=total+nums[right]
            while total>=target:
                length=min(length,right-left+1)
                total=total-nums[left]
                left=left+1
        
        if(length==float(inf)):
            length=0

        return length

        