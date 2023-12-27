class Solution {
    public int lengthOfLastWord(String s) {  
        String trimmedString = s.trim();
        int lastSpaceIndex = trimmedString.lastIndexOf(' ');
        String lastWord = trimmedString.substring(lastSpaceIndex + 1);
        return lastWord.length();
    }
}