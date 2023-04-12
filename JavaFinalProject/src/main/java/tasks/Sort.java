package tasks;

import model.Anime;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void handleTask(Scanner scanner) {
        int choice = 0;
        String [] options = {
                "sort by title ( A - Z)",
                "sort by title ( Z-A)",
                "sort by release date ( old to new)",
                "sort by release date (new to old)",
                "sort by rating (low to high)",
                "sort by rating (high to low)",
                "sort by minute (short to long)",
                "sort by minute (long to short)"

        };
        sort_program:while(true){
            choice = Helpers.getChoice(scanner, array);
            switch(choice){
                case 1:
                    // sort title A-z
                    break;
                case 2:
                    // sort title Z-A
                    break;
                case 3:
                    // sort date old-new
                    Collections.sort(anim);
                    break;
                case 4:
                    // sort date new=old
                    break;
                case 5:
                    // sort rating 1-10
                    break;
                case 6:
                    // sort rating 10-1
                    break;
                case 7:
                    // sort minutes 1-24
                    break;
                case 8:
                    // sort minutes 24-1
                    break;
                    // exit
                default:
                    break sort_program;
            } // close of switch;
            Helpers.printArray(anime);
            Helpers.pressEnterToContinue(scanner);
        } // close of while
    }
}
