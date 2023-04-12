package utilities;

import model.Anime;
import model.AnimeDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] options){
        for(int i = 0; i < options.length;i ++){
            System.out.println((i +1) + ") " + options[i]);
        }
        System.out.println((options.length + 1) + ") Exit");
        return UserInput.getInt(scanner, "Choose an option",1,7);
    }
    public static void pressEnterToContinue(Scanner scanner){
        UserInput.getString(scanner,"press enter to continue");
    }

    public static void printArray(ArrayList<Anime> animes) {
        for(Anime anime: animes){
            System.out.println("Title: " + anime.getTitle());
            System.out.println("episode: " + anime.getEpisode());
            System.out.println("season: " + anime.getSeason());
            System.out.println("type: " + anime.getType());
            System.out.println("rating: " + anime.getRating());
            System.out.println("author: " + anime.getAuthor());
            System.out.println("release date: " + anime.getReleaseDate());
            System.out.println();
        }

    }


}
