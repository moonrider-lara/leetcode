class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.' && c >=  48 && c <= 57) {
                    for (int k = 0; k < 9; k++) {
                        if (board[i][k] == c && k != j) 
                            return false;
                        if (board[k][j] == c && k != i) 
                            return false;
                    }
                    
                    int ipart = i/3;
                    int jpart = j/3;
                    int iposition = i%3;
                    int jposition = j%3;
                    
                    for (int p1 = 0; p1 < 3; p1++) {
                        for (int p2 = 0; p2 < 3; p2++) {
                            int ipp = ipart*3;
                            int jpp = jpart*3;
                            if (board[ipp+p1][jpp+p2] == c && jpp+p2 != j && ipp+p1 != i ) return false;
                            if (board[ipp+p1][jpp+p2] == c && jpp+p2 != j && ipp+p1 != i ) return false;
                        }
                    }
                    
                    
                } else if (c == '.') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        return true;
        
    }
}