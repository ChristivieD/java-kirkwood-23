package en.codegym.task.pro.task05.task0509;

/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i * j);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
