class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder answer = new StringBuilder();
        int len = s.length();
        int section = 2 * (numRows - 1);
        
        for (int currRow = 0; currRow < numRows; ++currRow) {
            int index = currRow;

            while (index < len) {
                answer.append(s.charAt(index));

                // If currRow is not the first or last row
                // then we have to add one more character of current section.
                if (currRow != 0 && currRow != numRows - 1) {
                    int charsInBetween = section - 2 * currRow;
                    int index2 = index + charsInBetween;
                    
                    if (index2 < len) {
                        answer.append(s.charAt(index2));
                    }
                }
                // Jump to same row's first character of next section.
                index += section;
            }
        }
        
        return answer.toString();
    }
}