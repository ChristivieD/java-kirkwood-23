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
        if(month == 3 || month == 4 ){
            if(day >= 21 && day <= 19){
            }
            System.out.println("you are Aries");
        }
        else if(month == 4 || month ==5){
            if(day >= 20 && day >= 20){
            }
            System.out.println("you are Taurus");
        }
        else if(month == 5 || month == 6){
            if(day >= 21 && day <= 20){
            }
            System.out.println("you are Gemini");
        }
        else if(month == 6 || month == 7){
            if(day >= 21 && day <= 22){
            }
            System.out.println("you are Cancer");
        }
        else if(month == 7 || month == 8){
            if(day >= 23 && day <= 22){
            }
            System.out.println("you are Leo");
        }
        else if(month == 8 || month == 9){
            if(day >= 23 && day <= 22){
            }
            System.out.println("you are Virgo");
        }
        else if(month == 9 || month == 10){
            if(day >= 23 && day <= 22){
            }
            System.out.println("you are Libra");
        }
        else if(month == 10 || month == 11){
            if(day >= 23 && day <= 21){
            }
            System.out.println("you are Scorpio");
        }
        else if(month == 11 || month == 12){
            if(day >= 22 && day <= 21){
            }
            System.out.println("you are Sagittarius");
        }
        else if(month == 12 || month == 1){
            if(day >= 22 && day <= 19){
            }
            System.out.println("you are Capricorn");
        }
        else if(month == 1 || month == 2){
            if(day >= 20 && day <= 18){
            }
            System.out.println("you are Aquarius");
        }
        else if (month == 2 || month == 3){
            if(day >= 19 && day <= 20){
            }
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
