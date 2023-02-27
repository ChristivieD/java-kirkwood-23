package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while(scanner.hasNextInt()){
            int x = scanner.nextInt();
            if(x < min){
                secondMin = min;
                min = x;
            }
            else if(x > min && x < secondMin){
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}