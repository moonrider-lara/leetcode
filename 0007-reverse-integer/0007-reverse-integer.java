class Solution {
    public int reverse(int x) {
        long rvs = 0;
        int origin = x;
        
        while (x != 0) {
            rvs *= 10;
            rvs += x%10;
            x /= 10;
        }
        
        // int result = ( origin > 0 ) ? rvs : rvs*-1;

        if (rvs > Integer.MAX_VALUE || rvs < Integer.MIN_VALUE)
            return 0;
        
        return (int)rvs;
        
    }
}