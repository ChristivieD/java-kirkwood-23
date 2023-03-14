package en.codegym.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());

        if (r > 0) {
            multiArray = new int[r][];
            for (int i = 0; i < r; i++) {
                int newI = Integer.parseInt(scanner.nextLine());
                multiArray[i] = new int[newI];
            }
        }
    }
}
