package en.codegym.task.pro.task04.task0414;

import java.util.Scanner;

/* 
There's never too much of a good thing
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int a = scanner.nextInt();
        do{
            System.out.println(line);
            a--;
            
        }
        while(a > 0 && a < 4);

    }
}