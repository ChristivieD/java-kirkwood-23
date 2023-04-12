package utilities;

import model.Anime;

import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] array){
        for(int i = 0; i < array.length;i ++){
            System.out.println((i +1) + ") " + array[i]);
        }
        System.out.println((array.length + 1) + ") Exit");
        return UserInput.getInt(scanner, "Choose an option",1,7);
    }
    public static void pressEnterToContinue(Scanner scanner){
        UserInput.getString(scanner,"press enter to continue");
    }

    public static void printArray(ArrayList<Anime> anime) {
        for(Anime anime: animes){

        }

    }


}
