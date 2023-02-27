package en.codegym.task.pro.task04.task0406;

import java.util.Scanner;

/* 
We show what we get
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("enough")){
                break;
            }
            System.out.println(line);
        }

    }
}