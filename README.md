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

