package en.codegym.task.pro.task05.task0510;

/* 
Triangular array
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //write your code here
        int[][] array = new int[10][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
