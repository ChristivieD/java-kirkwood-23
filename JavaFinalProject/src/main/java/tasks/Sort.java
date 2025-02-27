package tasks;

import model.Anime;
import model.AnimeDAO;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort implements TaskHandler {
    public void handleTask(Scanner scanner) {
        int choice = 0;
        String [] options = {
                "sort by title ( A - Z)",
                "sort by title ( Z-A)",
                "sort by release date ( old to new)",
                "sort by release date (new to old)",
                "sort by rating (low to high)",
                "sort by rating (high to low)",
                "sort by season (short to long)",
                "sort by season (long to short)"

        };
        sort_program:while(true){
            System.out.println("\n** SORT MENU **");
            choice = Helpers.getChoice(scanner, options);
            ArrayList<Anime> animes = AnimeDAO.getAnimes();
            switch(choice){
                case 1:
                    // sort title A-z
                    Collections.sort(animes, Comparator.comparing(Anime::getTitle));
                    break;
                case 2:
                    // sort title Z-A
                    Collections.sort(animes,(a,b) -> a.getTitle().compareTo(b.getTitle()) * -1);
                    break;
                case 3:
                    // sort date old-new
                    Collections.sort(animes, Comparator.comparing(Anime::getReleaseDate));
                    break;
                case 4:
                    // sort date new-old
                    Collections.sort(animes, (a, b) -> a.getReleaseDate().compareTo(b.getReleaseDate()) * -1);
                    break;
                case 5:
                    // sort rating 1-10
                    Collections.sort(animes, Comparator.comparing(Anime::getRating));
                    break;
                case 6:
                    // sort rating 10-1
                    Collections.sort(animes,Comparator.comparingDouble(Anime::getRating).reversed());
                    break;
                case 7:
                    // sort season 1-20
                    Collections.sort(animes,Comparator.comparingInt((Anime::getSeason)));
                    break;
                case 8:
                    // sort season 20-1
                    Collections.sort(animes,Comparator.comparingInt(Anime::getSeason).reversed() );
                    break;
                    // exit
                default:
                    break sort_program;
            } // close of switch;
            Helpers.printArray(animes);
            Helpers.pressEnterToContinue(scanner);
        } // close of while
    }
}
