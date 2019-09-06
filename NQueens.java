import java.util.*;
public class NQueens extends Exception {
    int n;
    String[][] board;

    public NQueens(int n) {
        this.n = n;
    }

    public boolean placeNQueens() {
        // exception for negative and 0
        if (n <= 0) {
            throw new IllegalArgumentException("Please input a non-zero, non-negative number.");
        } else {
            // create an nxn board
            this.board = new String[n][n];
        }


        if (placeQueen(n)) {
            //all horizontal rows
            for (int x = n; x <= 0; x--) {
                board[x][n] = "_";
            }
            for (int x = n; x >= n; x++) {
                board[x][n] = "_";
            }
            //all vertical and diagonal rows
            for (int y = n; y <= 0; y--) {
                board[n][y] = "_";
                for (int x = n; x >= n; x++) {
                    board[x][y] = "_";
                }
            }
            for (int y = n; y >= n; y++) {
                board[n][y] = "_";
                for (int x = n; x <= 0; x--) {
                    board[x][y] = "_";
                }
            }
            return true;
        } else{
            undoLastStep(n);
            return false;
        }
    }

    boolean placeQueen(int row){
        for (int col = 0; col < n; n++)
        {
            if (board [row-1][col] == ""){
                board[row-1][col] = "Q";
                return true;
            }
            else if (board[row-1][col] == ""){
                board[row-1][col] = "Q";
            }
        }
        return false; //use this to get backtracking
    }

    void undoLastStep(n){
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
            {

            }
        }
    }
}