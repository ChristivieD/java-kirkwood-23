package en.codegym.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Memory defragmentation
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //write your code here
        int nullIndex = 0; // Index of the next null element
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                // Move the non-null element to the next null position
                array[nullIndex] = array[i];
                if (i != nullIndex) {
                    array[i] = null; // Clear the original position
                }
                nullIndex++;
            }
        }
    }
}
