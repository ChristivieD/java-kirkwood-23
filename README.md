# Java Kirkwood 2023
 This is the work  I complete for my CIS-171 
 Java course at Kirkwood Community College.
 Below is a journal of all the things I learned 
 throughout the class.
 
## Introduction
In the introduction unit we created accounts and 
installed software needed for the class.

Using [IntelliJ](https://jetbrains.com/idea) we created a module with a **Java 
class** inside it. Inside the class we created a main method 
that displays a message in terminal. We can type "sout" followed by the 
key to generate the `System.out.println()` statement.
``` Java 
public class MyClass {
 public static void main(String[] args) {
   System.out.println("My name is Christivie!");
 }
}
```
We initialized our project as a __Git repository__ and pushed our project code 
to [GitHub](https://gtihub.com). Our project includes a **.gitignore** 
file telling Git which files not to track.

Going forward, whenever I complete a task 
I will __Add-Commit-Push (ACP)__

git add . git commit -m "describe my work" git push origin main

## Chapter 1
In chapter 1, we learned about the arithmetic operators which are: 
__+,-,(*),/__ 

we can use it with the variables.
There are also two control statement __the if and for statement__ which works like the **IF**
and **FOR** statement in any other program.
``` Java

class IfDemo{
 public static void main(String []args){
  int a, b, c;
  a = 2;
  b = 3;
 if (a< b) System.out.println("a less than b ")
 }
}
```
This is a little example about the If statement

## Chapter 2
In this chapter there are couples of word that should be used in **Java**

Here are the important word to retain

The Boolean represents __true or false__ values as in Python

The byte is  8-bit integer

The double is a double-precision floating point  

the float is a single-precision floating point

the int
the long and short


## Notes
- The two primitive data types that store decimal numbers are float and double (most common).
- float gives you approximately 6-7 decimal digits precision.

- float is represented in 32 bits (4 bytes)

- double gives you approximately 15-16 decimal digits precision, therefore the range of numbers is larger for double.

- double is represented in 64 bits (8 bytes)

- Java provides a built-in Math opens in new window opens in new window class with many helpful methods.
- Similar to String, and unlike Scanner and BigDecimal, you do not need to import anything to use Math.
- All Math fields and methods are static, meaning you call them using Math.XXX -- you do not need to instantiate a new Math object like you do for Scanner or BigDecimal.
- Common items include:
- Math.PI
- Returns the double value 3.141592653589793. Note that this is a fixed (or final) value, meaning you can't modify it.
- Math.abs()
- Returns the absolute value (distance from 0) of a single numerical value.
- Math.ceil() and Math.floor()
- Returns a double rounded up or down.
- Math.max() and Math.min()
- Returns the larger or smaller  of two numerical values.
- Math.pow()
- Returns a double representing one value raised to a second value.
- Math.random()
- Returns a double between 0.00 and 0.99
- Math.round()
- Returns a decimal number rounded up or down
- Math.sqrt()
- Returns the square root of a single number.
- Math.hypot()
- Returns the length of the hypotenuse given the lengths of two sides (Pythagorean theorem)
- There are many more methods used for calculus, trigonometry, geometry, and more.
### casting
double x, y;
// ...
(int) (x, y)
```java
class CastDemo{
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 5.5;
        y = 1.5;
        i = (int) (x/y);
        System.out.println("Integer outcome of x/y: " + i);
    }
}


```


## chapter 3
In chapter 3, we learned about the statement that conyrol a program;s 
flow of execution. Here are three categories: **selection statement** (if and switch),
**iteration statement** (for, while, and do-while loops), and **jump statement** 
(break,continue, and return).
Here is a small  example of one of the statement below:
```java
class switchDemo{
 public static void main(String[] args) {
  int i;
  for(i = 0; i < 10; i++)
      switch(i){
       case 0:
        System.out.println("i is zero");
        break;
        case 1:
         System.out.println(" i is one");
         break;
       case 2 :
        System.out.println("i is two");
        break;
       default:
        System.out.println("i is three or more");
  }
 }
}
```
The general form of a __For loop__ is:
**for(initialization; condition; iteration){
    statement sequence
        }**
The general form of a __While loop__ is:
 **while(condition) statement;**
The general form of a __do-while loop__ is:
**do{
    statements;
    } while(condition);**

// class example
```java
//   public static void doubleArray(int [] array){
//        for (int i = 0; i < array.length; i ++){
//            array[i] *=2;
//        }
//            
//   }
```
// if you want to modify the values in an array, use a count-controlled loop
// not a for-each loop.
// if you pass a primitive variable (int, double, boolean, char,etc) to a method, you are passing a copy of the value
// change made to the copy do not affect the original. if you want to
// the original, you must return a value from the method.
//If you pass an object variable (array, Shape, Book, etc) to a method, you are passing a reference of 
the object. Changes made to the reference will affect the original. No return type is need for the method.
