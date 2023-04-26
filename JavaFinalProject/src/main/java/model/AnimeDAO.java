package model;

import org.apache.commons.lang.WordUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimeDAO {
    private static ArrayList<Anime> animes;
    private static String filePath = new File("").getAbsolutePath() + "\\JavaFinalProject\\src\\main\\resources\\Anime_data.txt";
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

    public static void retrieveData() {
        if(animes == null){
            try(Scanner scanner = new Scanner(new File(filePath))){
                animes = new ArrayList<>();
                scanner.nextLine(); // read in the file row and don't do anything with it.
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String [] values = line.split("\t");
                    Anime anime = new Anime();
                    anime.setTitle(WordUtils.capitalize(values[0].toLowerCase()));
                    anime.setType(WordUtils.capitalize(values[2]));
                    anime.setEpisode(Integer.parseInt(values[4]));
                    anime.setSeason(Integer.parseInt(values[3]));
                    anime.setAuthor(WordUtils.capitalize(values[1]));
                    anime.setRating(Double.parseDouble(values[5]));
                    anime.setReleaseDate(LocalDate.parse(values[6], dateFormat));
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

    private static  void writeData(){
        try(PrintWriter writer = new PrintWriter(new File(filePath))){
            writer.println("Title\tauthor\ttype\tseason\tepisode\trating\trelease_date");
            for(Anime anime : animes){
                writer.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                        anime.getTitle(), anime.getAuthor().toUpperCase(),
                        anime.getType(),anime.getSeason(),
                        anime.getEpisode(),anime.getRating(),
                        anime.getReleaseDate().format(dateFormat));
            }
        }catch (FileNotFoundException e){
            System.out.println("THe write data function could not be processed ");
            System.out.println(e.getMessage());
        }

    }
    public static ArrayList<Anime> getAnimes(){
        return animes;
    }

    public static void  addAnime(Anime anime){
        // add to the array
        animes.add(anime);
        // update the csv file
        writeData();

    }

}
