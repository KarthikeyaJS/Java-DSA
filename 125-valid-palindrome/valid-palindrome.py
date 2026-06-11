class Solution:
    def isPalindrome(self, s: str) -> bool:
        temp=""
        for ch in s:
            if ch.isalnum():
                temp=temp+ch.lower()
        print(temp)
        return temp==temp[::-1]
        
        