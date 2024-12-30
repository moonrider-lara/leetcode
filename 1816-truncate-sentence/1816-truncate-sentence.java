class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        StringBuilder truncate = new StringBuilder();
        for(int i=0; i<k; i++){
            truncate.append(words[i]);
            // For spaces 
            if(i < k-1){
                truncate.append(" ");
            }
        }
        return truncate.toString();
    }
}