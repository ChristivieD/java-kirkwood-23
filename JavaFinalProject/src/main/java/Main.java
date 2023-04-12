import model.Anime;
import model.AnimeDAO;
import tasks.Sort;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimeDAO.retrieveData();
        // Only one user input Scanner allowed
        try(Scanner scanner = new Scanner(System.in)){
            int choice = 0;
            String[] options ={
                    "Get all anime",
                    "Sort  anime",
                    "Get an anime",
                    "Add an anime",
                    "Update an anime",
                    "Delete an anime"
            };
            main_program:while(true){
                // To Do:Prompt user for all options
                System.out.println("\n** MAIN MENU**");
                choice = Helpers.getChoice(scanner, options);
                switch(choice){
                    case 1:
                        // Get all records
                        Helpers.printArray(AnimeDAO.getAnimes());
                        break;
                    case 2:
                    // sort all records
                        Sort.handleTask(scanner);
                        break;
                    case 3:
                        // Get a single records
                        break;
                    case 4:
                        // Add a new record
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
                Helpers.pressEnterToContinue(scanner);
            } // close all while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method
    // write other methods here
} // close of main class