class Solution {
    public boolean isPalindrome(int x) {
        
        String s = x+"";
        int len = s.length();
        int half = len/2;

        if (len == 1) {
            return true;
        }
        if(x < 0) {
            return false;
        }
        
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == s.charAt(len-1-i)) {
                if(half < i || len == 2) 
                    return true;
            } else {
                return false;
            }
        }
        
        return false;
    }
}