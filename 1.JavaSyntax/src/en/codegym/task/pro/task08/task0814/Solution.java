package en.codegym.task.pro.task08.task0814;

/* 
Flags
*/

public class Solution {
    public static void main(String[] args) {
        int number = 10; // 1010 in binary
        int flagPos = 2;

        number = setFlag(number, flagPos);
        System.out.println(number); // should output 14 (1110 in binary)

        number = resetFlag(number, flagPos);
        System.out.println(number); // should output 10 (1010 in binary)

        System.out.println(checkFlag(number, flagPos)); // should output false
    }

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) != 0;
    }

}
