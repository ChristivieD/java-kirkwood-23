package ch3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LetterGuessingGame{
    public static char randomLetter(){
        int min = 65;
        int max = 90;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);
        return(char)randomNum;
    }

    public static void main(String[] args) {
        char guess = '?', answer = randomLetter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("The answer is " + answer);
        System.out.println("Guess a letter: ");
        while(true){
            guess = scanner.nextLine().charAt(0);
            boolean guessIsLoweCase = guess >= 97 && guess <= 122;
            if (guessIsLoweCase) {
                guess -= 32;
            }
            if (guess == answer) {
                System.out.println("Correct!");
                break;
            } else {
                if (!(guess >= 65 && guess <= 90) && !(guess >= 97 && guess <= 122) ){
                System.out.println("Invalid letter. Guess again: ");
            }else if (guess > answer){
                    System.out.println("Incorrect. Guess lowe: ");
                } else {
                    System.out.println("Incorrect. Guess higher: ");
                }
            }
        }


    }
}
