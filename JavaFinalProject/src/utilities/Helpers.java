package utilities;

import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] array){
        for(int i = 0; i < array.length;i ++){
            System.out.println((i +1) + ") " + array[i]);
        }
        System.out.println((array.length + 1) + ") Exit");
        return UserInput.getInt(scanner, "Choose an option",1,7);
    }


}
