package en.codegym.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Let's compare strings
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}
