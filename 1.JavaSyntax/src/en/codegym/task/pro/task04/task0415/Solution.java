package en.codegym.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        int r = scanner.nextInt();
        int area = (int) (pi * r * r);
        System.out.println(area);

    }
}