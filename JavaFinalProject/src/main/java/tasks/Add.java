package tasks;

import model.Anime;
import model.AnimeDAO;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler{
    @Override
    public void handleTask(Scanner scanner) {
        String title = UserInput.getString(scanner, "enter the anime title");
        String author = UserInput.getString(scanner,"enter the author");
        String type = UserInput.getString(scanner,"enter the types of animes");
        LocalDate releaseDate = UserInput.getDate(scanner, "enter the release date");
        int episode = UserInput.getInt(scanner, "How many episodes are there ? ", 0);
        int season = UserInput.getInt(scanner,"How many seasons are there? ");
        // final project part3 - write getDouble methods in the UserInput class
        double rating = UserInput.getDouble(scanner,"what is the rating?");
        boolean bestAnime = UserInput.getBoolean(scanner,"is tis the best anime ever?");
        // instantiate an object
        Anime anime = new Anime();
        anime.setTitle(title);
        anime.setAuthor(author);
        anime.setType(type);
        anime.setReleaseDate(releaseDate);
        anime.setEpisode(episode);
        anime.setSeason(season);
        // set the double in your own
        anime.setRating(rating);
        anime.setBestAnime(bestAnime);

        AnimeDAO.addAnime(anime);
        // add to the array
        // update the csv file
    }
}
