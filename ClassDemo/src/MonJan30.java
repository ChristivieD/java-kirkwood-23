import java.util.Scanner;

public class MonJan30 {
    public static void main(String[] args) {
        double earthWeight;
        double moonWeight;
        earthWeight = 190;
        moonWeight = earthWeight * .17;
        System.out.printf(" Your weight on the moon is %.2f pounds\n", moonWeight);


        int count = 0;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count += 1;
        System.out.println(count);
        count++;
        System.out.println(count);
        ++count;
        System.out.println(count);
        count = count + 5;
        count += 5; // add to the count
        count = count - 2;
        count = count * 3;
        count *= 3; // multiply the count by 3

        // Page 24-25
        // prints 0-9
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        // Prints even numbers 0-9
        for(int i = 0; i < 10 ; i += 2){
            System.out.println(i);
        }
        // Prints 10, 7, 4, 1
        for(int i = 10; i > 0; i -= 3){
            System.out.println(i);
        }
        // Prints 1, 2, 3, 4, 5
        for(int i =1; i<= 5; i = i+1){
            System.out.println();
        }
        // Page 26
        int age = 19;
        if(age >= 18){
            System.out.println("You can vote!");
        }
        // >,>= greater than or equal to
        // <,<= less than, or equal to
        // == equals
        // != not equals

        // Page 27
        String name = "Christivie";
        String college = "Kirkwood";
        System.out.println("My name is " + name +
                " and I am " + age
                + " years old and I attend" + college +
                "!");
//Page 28
//Prints numbers 1 to 100, only 10 numbers per line
        int numCount = 0;
        for(int x = 1; x <= 100; x++) {
            System.out.print(x + " " );
            numCount++;
            if(numCount == 10) {
                System.out.println();
                numCount = 0;
            }
        }
    }
}