class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        c=0
        while n>0:
            dig=n%10
            if dig==x:
                c=c+1
            n=n//10
        if c>=1 and dig !=x:
            return True
        return False    

        
            