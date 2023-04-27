package tasks;

import model.Anime;
import model.AnimeDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Search implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        while(true) {
            String titleSearch = UserInput.getString(scanner, "Search by title [~ to exit]");
            if (titleSearch.equals("~")) {
                break;
            }
            // Example 1" Linear Search
            // get all animes
            ArrayList<Anime> animes = AnimeDAO.getAnimes();
            ArrayList<Anime> filterAnime = new ArrayList<>();
            for (Anime anime : animes) {
                if (anime.getTitle().toLowerCase().contains(titleSearch.toLowerCase())) {
                    filterAnime.add(anime);
                }
            }
            // Example 2 : Declarative approach
//            ArrayList<Anime> filterAnime = new ArrayList<>();
//            filterAnime.removeIf((anime) ->! anime.getTitle().toLowerCase(). contains((titleSearch.toLowerCase())));
            if (filterAnime.size() >= 1) {
                Helpers.printArray(filterAnime);
            } else {
                System.out.println("We couldn't find any anime containing" + titleSearch + " '.");
            }
            Helpers.pressEnterToContinue(scanner);
        }
    }
}
