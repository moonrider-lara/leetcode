class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder result = new StringBuilder(); 
        int len = strs.length;
        int s = 0; // the shortest str index
        int shortest = strs[0].length(); // the shortest str length
        
        if(len == 1)
            return strs[0];
        
        for (int i = 0; i < len; i++) {
            if (shortest > strs[i].length()){
                shortest = strs[i].length();
                s = i;
            }
        }
        
        int charNum = 0;
        while (charNum < shortest) {

            for (int i = 0; i< len; i++) {
                char c = strs[s].charAt(charNum);
                if (strs[i].charAt(charNum) == c && i == len-1) {
                    result.append(c);
                } else if (strs[i].charAt(charNum) == c) {
                    continue;
                }else {
                    return result.toString();
                }
            }
            charNum++;
        }
        
        return result.toString();
    }
}