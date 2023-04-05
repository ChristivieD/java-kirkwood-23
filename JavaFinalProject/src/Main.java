import model.Anime;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Only one user input Scanner allowed
        try(Scanner scanner = new Scanner(System.in)){
            int choice = 0;
            String[] options ={
                    "Get all anime",
                    "Sort all anime",
                    "Get an anime",
                    "Add an anime",
                    "Update an anime",
                    "Delete an anime"
            };
            main_program:while(true){
                // To Do:Prompt user for all options
                choice = Helpers.getChoice(scanner, options);
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
//                        Anime anime1 = new Anime("Demon slayer", 24,1.99,
//                                LocalDate.of(2023,04,12));
//                        System.out.println(anime1.getTitle());
//                        System.out.println(anime1.getMinutes());
//                        Anime anime2 = new Anime("Jujutsu kaisen",22.54,2.99,
//                                LocalDate.of(2023,04,20));
//                        System.out.println(anime2.getTitle());
//                        System.out.println(anime2.getMinutes());
//                        System.out.println(Anime.getAnimeCount());
//                        Anime anime3 = anime1;
//                        anime3.setMinutes(24);
//                        System.out.println(anime1.getMinutes());
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