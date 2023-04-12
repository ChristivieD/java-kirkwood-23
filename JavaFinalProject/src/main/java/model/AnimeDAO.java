package model;

import org.apache.commons.lang.WordUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimeDAO {
    private static ArrayList<Anime> animes;

    public static void retrieveData() {
        if(animes == null){
            try(Scanner scanner = new Scanner(new File("JavaFinalProject\\src\\main\\resources\\anime.txt"))){
                animes = new ArrayList<>();
                scanner.nextLine(); // read in the file row and don't do anything with it.
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String [] values = line.split("\t");
                    Anime anime = new Anime();
                    anime.setTitle(WordUtils.capitalize(values[0].toLowerCase()));
                    anime.setType(WordUtils.capitalize(values[3]));
                    anime.setEpisode(Integer.parseInt(values[4]));
                    anime.setSeason(Integer.parseInt(values[3]));
                    anime.setType(WordUtils.capitalize(values[2]));
                    anime.setAuthor(WordUtils.capitalize(values[1]));
                    anime.setRating(Double.parseDouble(values[5]));
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
                    anime.setReleaseDate(LocalDate.parse(values[6], format));
                    // set remaining values here
                    animes.add(anime);
                }
                Collections.sort(animes);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
    public static ArrayList<Anime> getAnimes(){
        return animes;
    }
}
