class Solution {
    public boolean isValidSudoku(char[][] board) {
        //One row & column calc and another will be individual sub-board calc
        Set<Character> char_set = new HashSet<>();
        //check row wise 
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.' && char_set.contains(board[i][j])) return false;
                if(board[i][j] != '.') char_set.add(board[i][j]);
            }
            char_set.clear();
        }
        char_set.clear();
        //check column wise
        for(int j = 0; j < board.length; j++) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][j] != '.' && char_set.contains(board[i][j])) return false;
                if(board[i][j] != '.') char_set.add(board[i][j]);
            }
            char_set.clear();
        }
        char_set.clear();
        //check individual sub-boards
        int i = 0, j = 0;
        while(i <= 8) {
            for(int a = i; a <= i + 2; a++) {
                for(int b = j; b <= j + 2; b++) {
                    if(board[a][b] != '.' && char_set.contains(board[a][b])) return false;
                    if(board[a][b] != '.') char_set.add(board[a][b]);
                    }
                }
            j += 3;
            if(j >= 8 && i < 8) {
                i += 3;
                j = 0;
            }
            char_set.clear();
        }
        return true;
    }
}