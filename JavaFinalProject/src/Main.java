import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Only one user input Scanner allowed
        try(Scanner scanner = new Scanner(System.in)){
            int choice = 0;
            main_program:while(true){
                System.out.println("Select an option: ");
                // To Do:Prompt user for all options
                choice = UserInput.getInt(scanner, "Choose an option",1,7);
                switch(choice){
                    case 1:
                        // Get all records
                        break;
                    case 2:
                    // sort all records
                        break;
                    case 3:
                        // Get a single records
                        break;
                    case 4:
                        // Add a new record
//                        String country = UserInput.getString(scanner, "enter the title");
//                        boolean isHardcover = UserInput.getBoolean(scanner, "Is this a hardcover book?");
//                        int numPages = UserInput.getInt(scanner, "How many pages", 1);
//                        int temperature = UserInput.getInt(scanner, "what temperature is it today?");
                        LocalDate publicationDate = UserInput.getDate(scanner,"enter the date of publication");
                        System.out.println("Month: " + publicationDate.getMonthValue());
                        System.out.println("Day of month: " + publicationDate.getDayOfMonth());
                        System.out.println("Year: " + publicationDate.getYear());
                        break;
                    case 5:
                        // Update a single records
                        break;
                    case 6:
                        // Delete a single record
                        break;
                    case 7:
                        // exit
                        break main_program;
                } // close of switch
            } // close all while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method
    // write other methods here
} // close of main class