package utilities;

import model.Anime;
import model.AnimeDAO;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] options){
        int choice = UserInput.getInt(scanner, "Choose an option 1-" + (options.length + 1),1,(options.length) + 1);
        return choice;
    }
    public static void pressEnterToContinue(Scanner scanner){
        UserInput.getString(scanner,"press enter to continue");
    }

    public static void printArray(ArrayList<Anime> animes) {
        System.out.println(Anime.getHeaderRow());
        for(Anime anime: animes){
            System.out.println(anime);
        }

    }
    public static String formatDate(LocalDate date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = date.format(format);
        return formattedDate;
    }
    public static String formatCurrency(double amount){
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        return "$" + formatter.format(amount);
    }


}
