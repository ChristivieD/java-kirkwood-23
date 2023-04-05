import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        // NAVIGATOR: CHRISTIIVE
        // DRIVER: NIC
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday = getDate(scanner, "enter the Birthday");
        int month = birthday.getMonthValue();
        int day = birthday.getDayOfMonth();
        if(month == 3 && day >= 21 || month == 4 && day <= 19){
            System.out.println("you are Aries");
        }
        else if(month == 4 && day >=20  || month ==5 && day <= 20){
            System.out.println("you are Taurus");
        }
        else if(month == 5 && day >=21 || month == 6 && day <=20){
            System.out.println("you are Gemini");
        }
        else if(month == 6 && day >=21 || month == 7 && day <=22){
            System.out.println("you are Cancer");
        }
        else if(month == 7 && day >=23 || month == 8 && day <=22){
            System.out.println("you are Leo");
        }
        else if(month == 8 && day >=23 || month == 9 && day <=22){
            System.out.println("you are Virgo");
        }
        else if(month == 9 && day >=23 || month == 10 && day >=22){
            System.out.println("you are Libra");
        }
        else if(month == 10 && day >=23 || month == 11 && day <=21){
            System.out.println("you are Scorpio");
        }
        else if(month == 11 && day >=22 || month == 12 && day <=21){
            System.out.println("you are Sagittarius");
        }
        else if(month == 12 && day >=22 || month == 1 && day <=19){
            System.out.println("you are Capricorn");
        }
        else if(month == 1 && day >=20 || month == 2 && day <=18){
            System.out.println("you are Aquarius");
        }
        else if (month == 2 && day >=19 || month == 3 && day <=20){
            System.out.println("you are Pisces");
        }
    }

    public static LocalDate getDate(Scanner scanner, String prompt) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("M-d-yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate = null;
        while (true) {
            System.out.print(prompt + "[mm/dd/yyyy]: ");
            String dateStr = scanner.nextLine();
            try {
                userDate = LocalDate.parse(dateStr, format1);
                break;
            } catch (DateTimeParseException e1) {
                try {
                    userDate = LocalDate.parse(dateStr, format2);
                    break;
                } catch (DateTimeParseException e2) {
                    try {
                        userDate = LocalDate.parse(dateStr, format3);
                        break;
                    } catch (DateTimeParseException e3) {
                        System.out.println("Invalid date format");
                    }
                }
            }
        }
        return userDate;
    }
}
