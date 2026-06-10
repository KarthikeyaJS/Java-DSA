class Solution:
    def search(self, nums: List[int], x: int) -> int:
        l=0
        r=len(nums)-1
        while(l<=r):
            mid=l+(r-l)//2
            if x<nums[mid]:
                r=mid-1
            elif x>nums[mid]:
                l=mid+1
            else:
                return mid


        return -1
        