package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if((num1 + num2) > num3 || (num3 + num2) > num1 || (num1 + num3) > num2){
            System.out.println(TRIANGLE_EXISTS);
        } else {
        System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }
}
