package en.codegym.task.pro.task06.task0605;

/* 
Correct order
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //write your code here
        for(int i= array.length - 1; i >= 0; i--){
            System.out.print( i + ",");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i= 0; i < array.length; i++) {
            System.out.print(i + ", ");
        }

        System.out.println(" ");
    }
}
