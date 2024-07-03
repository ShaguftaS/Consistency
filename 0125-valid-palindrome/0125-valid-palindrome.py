class Solution(object):
    def isPalindrome(self, s):
        t = s.lower()
        t = ''.join(char for char in t if char.isalnum())
        
        left, right = 0, len(t) - 1
        while left < right:
            if t[left] != t[right]:
                return False  
            left += 1
            right -= 1
        
        return True
        