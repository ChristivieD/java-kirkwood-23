package ch1andch2;

import java.util.Scanner;

public class WedFeb1 {
    public static void main(String[] args) {
        // convert numbers to string
        int num = 34;
        String numStr = num + "";
        String numStr2 = Integer.toString(num);  // this is a call to a static method
        // A static method belongs to a class.

        // convert strings to numbers
        String num2 = "34";
        int num2Int = Integer.parseInt(num2); // this is a call to static method
        // Talk about the String. length, .toUpperCase, and toLowerCase methods
        String myName = "Christivie Mauwa";
        System.out.println(myName.length()); // this is a call to a non-static method
        System.out.println(myName.toUpperCase()); // this is a call to a non-static method
        System.out.println(myName.toLowerCase());// this is a call to a non-static method
        // non-static method methods are called on objects, not the class name


        Scanner console = new Scanner(System.in); // console is an object. scanner is a method
        double s = console.nextDouble(); // Calling a non-static method
        long  reallyBigNum = 999999999999999L;
        float f = 99.999999f;
        System.out.println(reallyBigNum);
        System.out.println(f);

        int side1  = 3;
        int side2 = 4;
        double side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2)); // sqrt and pow are static
        System.out.println(side3);  // 5.0
        String firstName = "Christivie";
        char lastInitial = 'M';
        char firstLetter = firstName.charAt(0); // charAt is a non-static because it is called using an object not the string class
        char secondLetter = firstName.charAt(1);
        char thirdLetter = firstName.charAt(2);
        char lastLetter = firstName.charAt(firstName.length() - 1);

        boolean isHappy = true; // or false
        int age =23;
        boolean canVote = (age >= 18);

        boolean likesJava = true;
        System.out.println(likesJava);

        // Escape character
        System.out.println("First line\nSecond line");
        System.out.println("Column 1\tColumn 2\tcolumn 3");
        System.out.println("The official mascot of Kirkwood Athletics is \"Sammy the Eagle\".");
        System.out.println("C:\\Users\\myUserNAme\\Kirkwood");

        // Calculate the area of a circle
        System.out.println("Enter the radius: ");
        double radius = console.nextDouble();
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        // Calculate the volume of a cylinder
        System.out.println("Enter the height: ");
        double height = console.nextDouble();
        double VolumeOfCylinder = areaOfCircle * height;
        System.out.printf("%.1f\n", VolumeOfCylinder);
    }
}
