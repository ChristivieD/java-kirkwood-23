package en.codegym.task.pro.task08.task0805;

/*
Magic 8 ball
*/

import java.util.Random;

public class MagicBall {
    public static String getPrediction(){
        Random random = new Random();
        int num = random.nextInt(8);

        switch(num){
            case 0:
                return "Certainly";
            case 2:
                return "Definitely";
            case 3:
                return "Most likely";
            case 4:
                return "The outlook is good";
            case 5:
                return "Ask later";
            case 6:
                return "Try again";
            case 7:
                return "My answer is no";
            case 8:
                return "Very doubtful";
            default:
                return null;

        }
    }

}
