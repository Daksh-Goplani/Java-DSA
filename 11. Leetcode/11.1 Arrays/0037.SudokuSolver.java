class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;
        int row = -1, col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if found empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
            // sudoku is solved
        }
        // backtrack
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char ch) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }
        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == ch) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}