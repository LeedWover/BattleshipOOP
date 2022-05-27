package com.company;

public class Display {
    Input input = new Input();
    public void gameMenu() {

        System.out.println(
                """
                            _           _   _   _           _     _      \s
                           | |         | | | | | |         | |   (_)     \s
                           | |__   __ _| |_| |_| | ___  ___| |__  _ _ __ \s
                           | '_ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\\s
                           | |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |
                           |_.__/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/\s
                                                                   | |   \s
                                                                   |_|\s
                                                                   
                                                    # #  ( )
                                                 ___#_#___|__
                                             _  |____________|  _
                                      _=====| | |            | | |==== _
                                =====| |.---------------------------. | |====
                  <--------------------'   .  .  .  .  .  .  .  .   '--------------/
                    \\                                                             /
                     \\_______________________________________________CodeCool____/
                     
                  1. New Game  2. Quit   
                     
                   """
        );

        input.StartOrQuit();
    }
    public void displayBoard(String[][] board) {
        for(String[] row : board) {
            for(String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
