package en.codegym.task.pro.task08.task0813;

/* 
Power of two
*/

public class Solution {

    public static int getPowerOfTwo(int power) {
        if (power < 0 || power > 31) {
            throw new IllegalArgumentException("Power must be between 0 and 31");
        }
        return 1 << power;
    }

}
