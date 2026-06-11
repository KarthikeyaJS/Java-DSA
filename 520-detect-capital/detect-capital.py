class Solution:
    def detectCapitalUse(self, s: str) -> bool:
        return s==s.upper() or s==s.lower() or s==s.capitalize()
        