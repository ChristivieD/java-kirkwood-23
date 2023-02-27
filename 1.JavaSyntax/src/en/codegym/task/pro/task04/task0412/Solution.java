package en.codegym.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Sum of even numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //write your code here
        for(int a = start ; a < end; a ++){
            if(a % multiple != 0){
                continue;
            }
            sum = sum + a;
        }

        System.out.println(sum);
    }
}