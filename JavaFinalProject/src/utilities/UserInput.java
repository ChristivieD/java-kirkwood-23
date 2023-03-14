package utilities;

import java.util.InputMismatchException;
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
    public static int getInt(Scanner scanner, String prompt){
        return getInt(scanner, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Get a number no less than
    public static int getInt(Scanner scanner, String prompt, int min){
         return getInt (scanner, prompt, min, Integer.MAX_VALUE);
    }
    // Get a number within a range
    public static int getInt(Scanner scanner, String prompt, int min, int max){
        int value = 0;
        while(true){
            System.out.println(prompt + "[from" + min +"to" + max + "]: ");
            try{
                value = scanner.nextInt();
                scanner.nextLine(); // read enter key press
                if(value < min || value > max){
                    System.out.println("Value must be between" + min + "and" + max +" .");
                } else{
                    break;
                }
            }   catch(InputMismatchException e){
                scanner.nextLine(); // read enter key press
                System.out.println("Invalide number");
            }
        }
        return value;
    }
    // Get a date
}
