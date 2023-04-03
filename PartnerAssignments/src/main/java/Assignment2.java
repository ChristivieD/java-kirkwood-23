import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // navigator: Christivie
        // driver: Tyler
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        if(number % 2 == 0){
            System.out.println("Even");
        } else if(number % 2 == 1){
            System.out.println("Odd");
        } else{
            System.out.println("Neither");
        }
        //navigator:Tyler
        // driver: Christivie
        System.out.println("Enter seconds: ");
        int seconds = sc.nextInt();
        int days = seconds / 86400;
        int daysSeconds = seconds % 86400;

        int hours = daysSeconds / 3600;
        int hoursSeconds = daysSeconds % 3600;

        int mins = hoursSeconds / 60;
        int minSecs = daysSeconds % 60;

        System.out.printf("Days: %d\nHours: %d\nMinutes: %d\nSeconds: %d,", days, hours, mins,minSecs);
    }
}
