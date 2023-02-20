package ch1andch2;

import java.util.HashMap;
import java.util.Scanner;

public class MonFeb13 {

    public static int temperature;
    public static int diceRoll(){
        int roll = (int)(Math.random() * 6) + 1;
        return roll;
    }
    public static void main(String[] args) {
        temperature = 40;
        System.out.println(temperature);


        int i;
        for (int i = 0; i < 20; i++){
            System.out.println(diceRoll());
        }
        byte b = 1;
        short s = b;
        int i = s;
        long l = i;

        long l2 = 2;
        int i2 = (int)l2;
        short s2 = (short)i2;
        byte b2 = (byte)s2;

        double d = 5.5;
        int d2 = (int)d; // 5

        double d3 = 5;
        int d4 = (int)d3;
        System.out.println(d3); // 5.0
        if (Math.abs(d3 - d4) < 0.0001){
            System.out.println(d4); // 5
        }
        else{
            System.out.println(d3);
        }


        char letter = 'j';
        if(letter =='j'){
            System.out.println("Yes");
        }


        int age = 20;
        if (age >= 18) {
            System.out.println("Your= can vote!");
        } else {
            System.out.println("You cannot vote until" +
                    "You are at least 18 years old");
        }

        int yearsJobExperience = 0;
        // if you're at least 16 and have job experience
        if (age >= 16) {
            if (yearsJobExperience > 0) {
                System.out.println("You shoulg get a checking account");
            } else {
                System.out.println("You should get a job");
            }
        } else {
            System.out.println("You're not 16 yet");
        }
        if (age >= 16 && yearsJobExperience > 0) {
            System.out.println("You should get a checking account");
        }
        else if (age >= 16 && !(yearsJobExperience > 0)) {
            System.out.println("You Should get a job");
        }
        else {
            System.out.println("You are not 16 years old yet");
        }


        String dinnerOnFriday = "pizza";
        String lunchOnFriday = new String("pizza");
        if(dinnerOnFriday.equals(lunchOnFriday)) {
            System.out.println("You must have eaten leftovers");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " +(num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if (num2 != 0 && num1 > num2){
            System.out.println("Quotient: " + (num1/num2));
            System.out.println("Remainder: "+ (num1 % num2));
        }

    }
}