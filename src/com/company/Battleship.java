package com.company;

import java.util.Arrays;

public class Battleship {
    public static void main(String[] args) {
        Display display = new Display();
        BoardFactory boardFactory = new BoardFactory();
        display.gameMenu();
        display.displayBoard(boardFactory.createBoard());
        String[] cordinate = new Input().askForCordinate();
        display.displayBoard(boardFactory.modifieBoard(cordinate[0], cordinate[1]));
    }
}
