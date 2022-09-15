package com.nix.vyrvykhvost.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.nix.vyrvykhvost.commands.Command.SCANNER;

public class UserInputUtil {

    /*public static boolean printMenu(final Commands[] values){

        int userCommand = -1;
        do {
            for (int i = 0; i < values.length; i++) {
                System.out.printf("%d) %s%n", i, values[i]);
            }
            int input = SCANNER.nextInt();
            if (input >= 0 && input < values.length) {
                userCommand = input;
            }
        } while (userCommand == -1);
        final Command command;
        command = values[userCommand].getCommand();
        if (command == null) {
            return true;
        } else {
            command.execute();
            return false;
        }
    }*/


    private UserInputUtil() {
    }

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int getUserInput(int length, List<String> names) {
        int userType = -1;
        do {
            userType = getUserInput(names, length);
        } while (userType == -1);
        return userType;
    }

    private static int getUserInput(List<String> names, int length) {
        try {
            System.out.println("Please enter number between 0 and " + length);
            for (int i = 0; i < length; i++) {
                System.out.printf("%d) %s%n", i, names.get(i));
            }
            int input = Integer.parseInt(READER.readLine());
            if (input >= 0 && input < length) {
                return input;
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Input is not valid");
        }
        return -1;
    }
    public static List<String> getNamesOfType(final Commands[] values) {
        final List<String> names = new ArrayList<>(values.length);
        for (Commands type : values) {
            names.add(type.name());
        }
        return names;
    }
}
