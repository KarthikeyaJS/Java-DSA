class Solution:
    def searchInsert(self, nums: List[int], x: int) -> int:
        for i in range(len(nums)):
            if nums[i]>=x:
                return i
        return len(nums)