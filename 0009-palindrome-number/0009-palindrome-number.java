class Solution {
    public boolean isPalindrome(int x) {

        int rvsX = 0;
        int originX = x;
        
        while (x > 0) {
            rvsX *= 10;
            int num = x%10;
            rvsX += num;
            x /= 10;
        }

        if (originX < 0 || originX != rvsX) {
            return false;
        }
        
        return true;
        
    }
}