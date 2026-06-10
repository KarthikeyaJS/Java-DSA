class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        arr.sort()
        for i in range(len(arr)):
            if self.binary_search(arr,arr[i]*2,i):
                return True
        return False

    def binary_search(self,arr,x,idx):
        l=0
        r=len(arr)-1
        while(l<=r):
            m=l+(r-l)//2
            if arr[m]<x:
                l=m+1
            elif arr[m]>x:
                r=m-1
            else:
                if m!=idx:
                    return True
                return False
        return False
    