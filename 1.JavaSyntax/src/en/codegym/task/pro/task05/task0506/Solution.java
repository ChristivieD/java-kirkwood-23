package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int [n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < n ; i++){
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
