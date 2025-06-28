class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 : return False

        originX = x;
        reversedX = 0;

        while x > 0:
            reversedX *= 10
            num = x % 10
            reversedX += num
            x //= 10
        
        return  reversedX == originX