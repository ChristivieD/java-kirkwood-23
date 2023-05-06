package en.codegym.task.pro.task08.task0807;
import java.util.Scanner;
import java.lang.String;
import java.lang.System;

/* 
Imports: Part 2
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
