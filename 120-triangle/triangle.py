class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        return (f:=cache(lambda i,j:i<len(triangle) and triangle[i][j]+min(f(i+1,j),f(i+1,j+1))))(0,0)