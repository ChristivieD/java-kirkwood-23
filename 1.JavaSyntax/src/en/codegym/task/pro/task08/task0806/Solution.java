package en.codegym.task.pro.task08.task0806;


/* 
Imports: Part 1
*/

public class Solution {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.lang.String input = scanner.nextLine();
        java.lang.String[] words = input.split("\\s+");
        for (java.lang.String word : words) {
            System.out.println(word);
        }
    }
}
