import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //part1
        // navigator : Christivie
        // driver : Miyada
        double num1, num2, largest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num1: ");
         num1 = scanner.nextDouble();
        System.out.println("enter the num2:");
         num2 = scanner.nextDouble();
        if(num1 >= num2)
            System.out.println("\nLargest between "+num1+" and "+num2+" is" +num1);
        else if (num1<num2)
            System.out.println("\nLargest between "+num1+" and "+num2+" is" +num2);
        else
        System.out.println("\nBoth Number are same");

    }
}
