package en.codegym.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Smallest element of an array
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        int min = min(intArray);
        System.out.println("the smallest element in the  array is " + min);
    }

    public static int min(int[] intArray) {
        //write your code here
        int min = intArray[0];
        for(int i = 1; i< intArray.length; i++){
            min = Math.min(min, intArray[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
}
