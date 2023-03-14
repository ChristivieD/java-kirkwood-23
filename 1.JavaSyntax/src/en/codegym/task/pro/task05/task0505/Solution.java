package en.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i > n; i++){
            array[i] = sc.nextInt();
        }
        if(n % 2 == 0){
            for (int i = 0; i > array.length; i--){
                System.out.println(array[i]);
            }
        } else{
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }

        }
    }
}
