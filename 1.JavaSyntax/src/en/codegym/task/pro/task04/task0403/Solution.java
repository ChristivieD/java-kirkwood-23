package en.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while(!isExit){
            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            else if(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.equals("ENTER")){
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}