package en.codegym.task.pro.task05.task0503;

/* 
Working with elements of an array
*/

public class Solution {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {
        //write your code here
        if(array[0] % 2 == 0){
           array [0] = array[0];
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
