class Solution:
    def search(self, nums: List[int], x: int) -> int:
        l=0
        r=len(nums)-1
        while(l<=r):
            mid=(l+r)//2
            if x==nums[mid]:
                return mid
            elif x<nums[mid]:
                r=mid-1
            else:
                l=mid+1
        return -1
        