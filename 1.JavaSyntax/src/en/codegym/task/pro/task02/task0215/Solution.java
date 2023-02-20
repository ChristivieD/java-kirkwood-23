package en.codegym.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Reading numbers
*/

public class Solution {

    public static void main(String[] args) {
        //write your code here
        Scanner console = new Scanner(System.in);
        
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        
        System.out.println((num1 + num2 + num3) / 3);

    }
}
