package en.codegym.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double d = a * 3.6 ;
        int s =  (int) (Math.round(d));
        System.out.println(s);

    }
}