package en.codegym.task.pro.task03.task0311;

import java.util.Scanner;

/* 
High accuracy
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        double num1, num2, diff;
        boolean isEqual;

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        isEqual = (num1 == num2) ? true:false;

        if (isEqual) {
            System.out.println("The numbers are equal");
        }
        if (!isEqual) {
            System.out.println("The numbers are not equal");
        }
    }
}
