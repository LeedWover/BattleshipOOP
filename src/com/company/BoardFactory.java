package com.company;

public class BoardFactory {
    public String[][] createBoard() {
        String[][] board = new String[][]{
                {" ", "1", "2", "3", "4", "5"},
                {"A", "~", "~", "~", "~", "~"},
                {"B", "~", "~", "~", "~", "~"},
                {"C", "~", "~", "~", "~", "~"},
                {"D", "~", "~", "~", "~", "~"},
                {"E", "~", "~", "~", "~", "~"}};
        return board;
    }
    //Jelenleg csak egy x-et lehet vele letenni
    public String[][] modifieBoard(String x, String y) {
        String[][] board = createBoard();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][0] == x && board[0][j] == y) {
                    board[i][j] = "S";
                }
            }
        }

        return board;
    }
}
