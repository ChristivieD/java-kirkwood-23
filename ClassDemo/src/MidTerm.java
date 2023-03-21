import java.util.InputMismatchException;
import java.util.Scanner;

public class MidTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        while(true){
            int num =0;
            try {
                num = scanner.nextInt();
            } catch(InputMismatchException e){
               break;
            }
            // if the num is greater than the max, set it
            // if the num is less than the min, set it
        }
        System.out.println(highest + " " +lowest);
    }


}
