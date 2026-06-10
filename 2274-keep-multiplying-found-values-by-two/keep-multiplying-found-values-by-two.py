class Solution:
    def binary_search(self,arr,x):
        l=0
        r=len(arr)-1
        while(l<=r):
            m=l+(r-l)//2
            if arr[m]<x:
                l=m+1
            elif arr[m]>x:
                r=m-1
            else:
                return True
        return False

    def findFinalValue(self, nums: List[int], og: int) -> int:
        nums.sort()
        while(self.binary_search(nums,og)):
            og=og*2
        return og