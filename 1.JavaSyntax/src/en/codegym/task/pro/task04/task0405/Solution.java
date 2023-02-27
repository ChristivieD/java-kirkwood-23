package en.codegym.task.pro.task04.task0405;

/* 
Unfilled rectangle
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int h = 1;
        while(h <= 10){
            int w = 1;
            while(w <= 20){
                if(h == 1 || h == 10){
                    System.out.print("B");
                }
                else if(w == 1 || w == 20){
                    System.out.print("B");
                }
                else{
                    System.out.print(" ");
                }
                w++;
            }
            System.out.println();
            h++;
        }

    }
}