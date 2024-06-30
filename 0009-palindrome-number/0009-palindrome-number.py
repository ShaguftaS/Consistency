class Solution(object):
    def isPalindrome(self, x):
        rev = 0;
        tmp = x;
        if(x < 0):
            return False
        while(tmp !=0):
            rev = (rev * 10) + (tmp %10);
            tmp = tmp/10
        if(rev == x):
            return True
        else:
            return False
        
        