package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    boolean validateInput(String[] validInputs, String actualInput) {

        for (String input : validInputs) {
            if(input.contains(actualInput)) {
                return true;
            }
        }
        return false;
    }

    void StartOrQuit() {

        System.out.println("You want a new game?");
        String userInput = scanner.nextLine();
        while(!validateInput(new String[]{"1", "2"}, userInput)) {
            System.out.println("Your input is not valid, try again!");
            userInput = scanner.nextLine();
        }
        if(userInput.contains("2")) {
            System.out.println("Good Bye!");
            System.exit(0);
        }
    }

    String[] askForCordinate() {
        String[] userInputArray = {"A", "1"};
        System.out.println("Choose your ship position(A-E)");
        String userInput1 = scanner.nextLine().toUpperCase();

        while(!validateInput(new String[]{"A", "B", "C", "D", "E"}, userInput1)) {
            System.out.println("Your input is not valid, try again!");
            userInput1 = scanner.nextLine();
        }
        System.out.println("Choose your ship position(1-5)");
        String userInput2 = scanner.nextLine().toUpperCase();
        while(!validateInput(new String[]{"1", "2", "3", "4", "5"}, userInput2)) {
            System.out.println("Your input is not valid, try again!");
            userInput2 = scanner.nextLine();
        }
        userInputArray[0] = userInput1;
        userInputArray[1] = userInput2;
        return userInputArray;
    }

}
