import java.util.Scanner;

public class MonJan25 {
    public static void main (String[] args){
        //java comment
        System.out.println("Hello") ; // Another comment
//        System.out.println();
//        System.out.println();
//        System.out.println();
        /*
            Longer
            Java comment
         */


        String myFirstName = "Christivie";
        String myLAstName = "Mauwa";
        char middleInitial = 'D';
        int myAge = 20;
        Character myMiddleInitial = 'D';
        Integer age = 20;
        double myWeight = 190.5;
        double weight = 190.5;
        boolean likesPizza = true;
        float currentTemp =  30;
        long reallyLongNumber = 9999999999999999L;
        int reallyLongInt = 99999999;
        int biggestInt = Integer.MAX_VALUE;
        int a = 7;
        int b =2;
        System.out.println(a / b); // Python would print 3.5, Java print 3
        System.out.println(7 / 2.0); // 3.5
        System.out.println(7.0 / 2); // 3.5
        System.out.println(7.0 / 2.0); // 3.5
        System.out.println((double) a / b); //3.5
        System.out.print(a + b); // 9
        System.out.println(a - b); // 5
        System.out.println(a * b); // 14
        System.out.println(a % b); //1
        int c= 3;
        System.out.println (a + b* c); // 13
        System.out.println((a +b) * c); //27
        System.out.println(Math.min(a, b)); // 2
         String fName = "christivie";
         String lName = "Mauwa";
        System.out.println(fName + lName); // ChristivieMauwa
        System.out.println(fName + " " + lName); // Christivie Mauwa
        System.out.println(fName + " " + lName + " is " + myAge + " years old ");
        System.out.printf("%s %s is %d years old\n", fName, lName, myAge);
        int x = 2;
        double y = 1.1;
        System.out.println(x - y);
        System.out.printf("%.1f \n", x-y);

        int favNum;
        favNum = 34;
        int num1, num2;
        double d1, d2;
        num1 = 5;
        num2 = 2;
        d1 = 2.5;
        d2 = 5.2;
//        num1 = d1; // Cannot assign a double to an int
        d1 = num1; // ca assign an int to a double
        long l1 = 99L;

        double gallons;
        double liters;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number of gallons: ");
        gallons = scanner.nextDouble();
        liters = gallons * 3.7854;
        System.out.printf(" %f gallons is approximately %.2f liters \n", gallons, liters);
        int someNum = scanner.nextInt();
        String someName = scanner.nextLine();

        double pound;
        double gravity;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print(" Enter the weigh: ");
        gravity = scanner1.nextDouble();
        pound = ( pound * 17) / 100;
        System.out.printf(" %f weigh is approximately %.1f weigh\n ",gravity, weight);




    }
}