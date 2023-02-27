package utilities;

import java.util.Scanner;

public class UserInput {
    // Get String
    public static String getString(Scanner scanner, String prompt) {
        System.out.println(prompt + ": ");
        String value = scanner.nextLine();
        return value;
    }
    // Get boolean (yes or no)
    public static boolean getBoolean(Scanner scanner, String prompt){
        System.out.println(prompt + "[yes, no]: ");
        String value = "";
        do{
            System.out.println(prompt + "");
        }
        while(!value.equalsIgnoreCase("yes")
                && !value.equalsIgnoreCase("no")
                && !value.equalsIgnoreCase("y")
                && !value.equalsIgnoreCase("n"));
        return value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("y");

    }
    // Get any number
    // Get a number no less than
    // Get a number within a range
    // Get a date
}
