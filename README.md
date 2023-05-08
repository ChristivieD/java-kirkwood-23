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
An arraylist is a class
example
Book [] books = new Book[10];
ArrayList<Book> books = new ArrayList
## Chapter 8
# About Interfaces
An abstract clas is a class that you can't instantiate
an object from.
an interface is an abstract class with only abstract method
An abstract method is method with not implementation in the parents class.
child classes must implement them.
``` java

    public abstract double getArea();
    ( ; means there is no timplemetation)
```
# Class array
when using an interface use 'implements Comparable'.
if you return 0 or less, java will not swap the values
if you return 1 or more, java will swap the values
comparing two strings will return an integer
iterator: you can loop to the scanner

An interface is an abstract class with all 
abstracts methods.

A function interface is an interface with exactly
one abstract method.

example of question
short cast evaluation
If(a1 && a2)
if(a1||a2)
if one id true yhe other one is false
++ a means before the values are printted it means add 1 to the number first(add 1)
a++ means add one after the line is execute(still the same number)
reverse  int num = 658
num % 10 => 8
num / 10 => 58
print 
casting do that with a double
escaping characters:
i watched "the super mario bros" movie this weekend.
write a switch and a if statement # view the midterm exam
tenary operatoer with an if statement
String output = " "
if (temp > 80){
 output = "it's hot"
} esle if(temp > 65){
    output = "it's warm"
} else{
output = "it's chilly"}
answer: String output = (temp> 80)? "it's hot" : (temp > 65) ? "it's warm" : it's chilly
== boolean
.equals() comparison
while and for loop
```java
public class Myclass{
    public  static main(String args[]){
        String[] states = {"iowa", "nebraska"};
        for(int i = 0; i < states.length; i++){
        int j =states[i].length() - 1;
        while(j>0){
            System.out.print(states[i].charAt(j));
            j--;
        }
        System.out.println();
        }
    }
}

```
explain how to call  a static method and how we can call it 
use an example
break use and a loop and switch
continue use skip the current integration on the loop
return end the method 
know what is an abstract methods
what is an interface

Here are some examples for each chapter in the Java study guide:

Chapter 2:
- Writing an if statement:
```java
int num = 5;
if(num > 0){
System.out.println("The number is positive.");
}
```
- Short circuit evaluation:
```java
int a = 5;
if(a > 0 && (10 / a) > 2){
System.out.println("Both conditions are true.");
}
```
- Difference between a++ and ++a:
```java
int a = 5;
int b = a++; // b is assigned the value of a, then a is incremented by 1
int c = ++a; // a is incremented by 1, then c is assigned the value of a
```
- Using / and % for division:
```java
int a = 10;
int b = 3;
int result = a / b; // result is 3
int remainder = a % b; // remainder is 1
```
- Casting:
```java
double d = 3.14159;
int i = (int) d; // i is assigned the value 3, as the decimal portion is truncated
```
- Calculating sum and average:
```java
int[] nums = {1, 2, 3, 4, 5};
int sum = 0;
for(int i=0; i<nums.length; i++){
sum += nums[i];
}
double avg = sum / (double) nums.length; // casting one operand to a double ensures the division is done with floating-point arithmetic
```
- Escaping characters:
```java
String message = "She said, \"Hello.\"";
```

Chapter 3:
- Writing a switch statement:
``` java
int dayOfWeek = 3;
switch(dayOfWeek){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
break;
}
```
- Writing a ternary operator:
```java
int num = 5;
String message = (num > 0) ? "The number is positive." : "The number is zero or negative.";
System.out.println(message);
```
- == vs .equals():
```java
String str1 = "Hello";
String str2 = "Hello";
if(str1 == str2){ // compares object references
System.out.println("str1 and str2 refer to the same object.");
}
if(str1.equals(str2)){ // compares object values
System.out.println("str1 and str2 have the same value.");
}
```
- Writing a for loop:
```java
for(int i=1; i<=5; i++){
System.out.println(i);
}
```
- Writing a while loop:
```java
int i = 1;
while(i <= 5){
System.out.println(i);
i++;
}
```
- Writing a nested loop:
```java
for(int i=1; i<=3; i++){
for(int j=1; j<=5; j++){
System.out.print(i * j + " ");
}
System.out.println();
}
```
- Calling a static method:
```java
double area = Math.PI * Math.pow(radius, 2); // calling the static Math.PI and Math.pow() methods
```
- Using break, continue, and return:
```java
for(int i=1; i<=10; i++){
if(i == 5){
break; // exits the loop when i equals 5
}
if(i == 3){
continue; //
```
examples of break (), continue, and return:
In Java, `break(`, `continue`, and `return` are used to control the flow of execution in loops and methods.

`break` statement is used to exit a loop prematurely. When a `break` statement is encountered inside a loop, the loop is immediately terminated and control is passed to the next statement after the loop. Here's an example:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // exit the loop when i equals 5
    }
    System.out.println(i);
}
```

In this example, the loop prints the numbers from 1 to 4 and then exits when `i` equals 5.

`continue` statement is used to skip to the next iteration of a loop. When a `continue` statement is encountered inside
a loop, the current iteration of the loop is terminated and control is passed to the next iteration. Here's an example:

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // skip even numbers
    }
    System.out.println(i);
}
```

In this example, the loop prints the odd numbers from 1 to 9, skipping the even numbers.

`return` statement is used to exit a method prematurely and return a value to the caller. When a `return` 
statement is encountered inside a method, the method is immediately terminated and control is passed back to the caller.
Here's an example:

```java
public static int sum(int a, int b) {
    return a + b; // exit the method and return the sum of a and b
}
```

In this example, the `sum` method returns the sum of its two integer parameters. When the `return` 
statement is executed, the method is terminated and the sum value is returned to the caller.

A method is a block of code which only run when it is called
static belongs to the class.
a class is a template of an object and a object is an instance of a class
Chapter 4 - Examples in Java:

1. Creating a Class with Instance Variables, Constructors, and Getter and Setter Methods:
```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
```

2. Instantiating Objects:
```java
Person person1 = new Person("John", 25);
Person person2 = new Person("Jane", 30);
```

3. Writing a toString Method with Date and Number Formatting:
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthdate;
    
    public Person(String name, int age, Date birthdate) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getBirthdate() {
        return birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthdate);
        return "Person [name=" + name + ", age=" + age + ", birthdate=" + formattedDate + "]";
    }
}
```

4. Assigning an Object to a New Reference Variable and Modifying One of the References:
```java
Person person1 = new Person("John", 25);
Person person2 = person1;
person2.setName("Jane");

System.out.println(person1.getName()); // Output: "Jane"
System.out.println(person2.getName()); // Output: "Jane"
```

Chapter 5 - Examples in Java:

1. Accessing Array Values Using Indexes:
```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Output: 1
System.out.println(numbers[2]); // Output: 3
```

2. Getting the Length of an Array:
```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers.length); // Output: 5
```

3. Iterating Through an Array with for and for-each Loops:
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

for (int number : numbers) {
    System.out.println(number);
}
```

4. Using String length() and charAt():
```java
String message = "Hello, World!";
System.out.println(message.length()); // Output: 13
System.out.println(message.charAt(7)); // Output: "W"
```
Sure, here's an example of a switch statement with an if statement inside:

```java
public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 2;

        switch(dayOfWeek) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                if (dayOfWeek == 2) {
                    System.out.println("Today is also the second day of the week");
                }
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            default:
                System.out.println("It's not Monday, Tuesday, or Wednesday");
        }
    }
}
```

In this example, we have a switch statement that checks the value of the `dayOfWeek` variable.
If it's 1, it prints "It's Monday". If it's 2, it prints "It's Tuesday" and then checks if `dayOfWeek` is 
equal to 2 again using an if statement. If it is, it prints "Today is also the second day of the week".
If it's 3, it prints "It's Wednesday". If it's none of those values, it prints "It's not Monday, Tuesday,
or Wednesday".
Chapter 6:

Access modifiers private vs public:

Access modifiers control the visibility of a class or a class member. In Java, there are four types of
access modifiers:

- public: The public access modifier allows access to a class or a class member from any other class or package.
- private: The private access modifier allows access to a class or a class member only within the same class.
- protected: The protected access modifier allows access to a class or a class member within the same class, subclass,
- or package.
- default: If no access modifier is specified, then the default access modifier is applied, which allows access 
- to a class or a class member only within the same package.

Example:

```java
public class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar;

    // Methods can also have access modifiers
    public void publicMethod() {
        // Code here
    }

    private void privateMethod() {
        // Code here
    }

    protected void protectedMethod() {
        // Code here
    }

    void defaultMethod() {
        // Code here
    }
}
```

Writing methods:

Methods are a collection of statements that are grouped together to perform an operation. 
In Java, methods are defined within a class and can be called from other parts of the program. 
A method definition consists of a method signature, which includes the method name, return type, and parameter list,
and a method body, which contains the statements that are executed when the method is called.

Example:

```java
public class MyClass {
    public int add(int a, int b) {
        return a + b;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
```

Method overloading:

Method overloading is the process of defining multiple methods with the same name but with different parameters. 
The compiler determines which method to call based on the number, type, and order of the parameters passed to the 
method.

Example:

```java
public class MyClass {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Method overriding:

Method overriding is the process of defining a method in a subclass that has the same name, return type, and 
parameter list as a method in its superclass. The method in the subclass overrides the method in the superclass, 
and the subclass method is called instead of the superclass method when the method is called on an object of the subclass.

Example:

```java
public class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
```

Chapter 7:

Define a class hierarchy:

A class hierarchy is a way of organizing classes into a hierarchy based on their relationships. 
The most general class is called the superclass, and the more specific classes are called subclasses. 
Subclasses inherit the methods and variables of their superclass and can add additional methods and variables.

Example:

```java
public class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
```
Yes, the concept of inheritance and abstract classes is the same in Java as in C#. Java also supports inheritance through the use of the `extends` keyword to create a child class that inherits from a parent class. Similarly, Java also has abstract classes, which are declared using the `abstract` keyword and cannot be instantiated directly. Abstract classes can have abstract methods that must be implemented by concrete subclasses.

Here is an example of creating a child class constructor and identifying an abstract class in Java:

```java
// Abstract class
abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void start();
}

// Child class
class Car extends Vehicle {
    private int year;

    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    public void start() {
        System.out.println("Starting the car...");
    }
}

// Instantiating the child class
Car myCar = new Car("Toyota", "Camry", 2021);
```

In the above example, `Vehicle` is an abstract class with a constructor and an abstract method `start()`. The `Car`
class extends `Vehicle` and has its own constructor that calls the parent constructor using the `super` keyword. `Car`
also implements the `start()` method. Finally, an instance of `Car` is created using its constructor.
Sure, here are some explanations and examples for Chapter 8 topics in Java:

### Packages

In Java, packages are used to group related classes and interfaces together. Packages can also be used to control access to classes and interfaces, by specifying their access modifiers. To declare a class or interface as part of a package, the `package` keyword is used at the beginning of the source file, followed by the package name.

Here's an example of how to declare a package in Java:

```java
package com.example.myapp;

public class MyClass {
    // Class implementation
}
```

In the above example, the class `MyClass` is declared as part of the package `com.example.myapp`.

### The protected access modifier

In Java, the `protected` access modifier is used to declare a member of a class that can be accessed by subclasses, as well as other classes in the same package. Protected members are not accessible from outside the package, unless accessed through a subclass.

Here's an example of how to use the `protected` access modifier in Java:

```java
package com.example.myapp;

public class MyClass {
    protected int myProtectedField;

    protected void myProtectedMethod() {
        // Method implementation
    }
}

public class MySubclass extends MyClass {
    public void myMethod() {
        // Can access myProtectedField and myProtectedMethod from superclass
        myProtectedField = 10;
        myProtectedMethod();
    }
}
```

In the above example, `MyClass` declares a protected field and method that can be accessed by its subclass `MySubclass`.

### Interfaces and abstract methods

In Java, an interface is a collection of abstract methods that can be implemented by classes.
An interface is declared using the `interface` keyword, and its methods are declared without implementation.

Here's an example of an interface with an abstract method in Java:

```java
public interface MyInterface {
    void doSomething();
}
```

In the above example, `MyInterface` declares a single abstract method `doSomething()`.

### Implementing an interface

To implement an interface, a class must use the `implements` keyword followed by the interface name, and provide
implementations for all of its abstract methods.

Here's an example of a class that implements an interface in Java:

```java
public class MyTaskHandler implements TaskHandler {
    public void handleTask(Task task) {
        // Implementation of handleTask() method
    }
}
```

In the above example, `MyTaskHandler` implements the `TaskHandler` interface, which has a single abstract 
method `handleTask()`. `MyTaskHandler` provides its own implementation of the `handleTask()` method.

### The Comparable interface and compareTo method

In Java, the `Comparable` interface is used to define a natural ordering for objects of a class. 
The `Comparable` interface has a single method `compareTo()`, which takes an object of the same class and returns
an integer value that indicates the relative order of the two objects.

Here's an example of how to use the `Comparable` interface and `compareTo()` method in Java:

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person otherPerson) {
        return this.age - otherPerson.age;
    }
}
```

In the above example, `Person` implements the `Comparable` interface with the generic type parameter `Person`. 
The `compareTo()` method is implemented to compare the `age` field of two `Person` objects. This allows `Person` 
objects to be compared and sorted based on their age.

Chapter 14: Functional Interfaces, Comparator and Predicate Interface, Lambda Expressions

Functional interfaces, Comparator and Predicate Interface, and Lambda expressions are some 
of the key features of Java that support functional programming paradigms.

Functional interfaces are interfaces that have only one abstract method and can be used as 
the target for lambda expressions and method references. The `@FunctionalInterface`
annotation can be used to ensure that an interface is a functional interface.

Comparator and Predicate Interface are two predefined functional interfaces in Java. 
The `Comparator` interface is used to compare two objects, while the `Predicate` interface 
is used to evaluate a Boolean expression. Both of these interfaces are used in conjunction 
with lambda expressions to perform a variety of tasks.

Lambda expressions are anonymous functions that can be passed as arguments to methods or 
assigned to variables. They allow for more concise and expressive code, and can improve 
the readability of code that deals with functional programming constructs.

Here are some examples of using functional interfaces, Comparator and Predicate Interface,
and lambda expressions in Java:

1. Functional Interfaces Example:

```java
@FunctionalInterface
interface MyInterface {
    int performOperation(int a, int b);
}

public class MyMain {
    public static void main(String[] args) {
        // Using a lambda expression to implement the interface method
        MyInterface addition = (a, b) -> a + b;
        System.out.println(addition.performOperation(3, 5)); // Output: 8
        
        // Using a method reference to implement the interface method
        MyInterface multiplication = MyMain::multiply;
        System.out.println(multiplication.performOperation(3, 5)); // Output: 15
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
}
```

In the above example, we create a functional interface `MyInterface` that has one abstract 
method `performOperation()`. We then use lambda expressions and method references to implement 
this interface method.

2. Comparator Interface Example:

```java
import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Using a lambda expression to implement the Comparator interface
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));
        System.out.println(fruits); // Output: [Apple, Banana, Cherry, Date]

        // Using a method reference to implement the Comparator interface
        Collections.sort(fruits, String::compareTo);
        System.out.println(fruits); // Output: [Apple, Banana, Cherry, Date]
    }
}
```

In the above example, we use the `Comparator` interface to sort a list of fruits. 
We use lambda expressions and method references to implement the `compare()` 
method of the `Comparator` interface.

3. Predicate Interface Example:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyMain {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Using a lambda expression to implement the Predicate interface
        Predicate<String> startsWithA = s -> s.startsWith("A");
        fruits.removeIf(startsWithA);
        System.out.println(fruits); // Output: [Banana, Cherry, Date]

        // Using a method reference to implement the Predicate interface
        Predicate<String> startsWithB = MyMain::startsWithB;
        fruits.removeIf(startsWithB);
        System.out
```
Chapter 10: Reading from and Writing to Files in Java

In Java, you can read and write data to files using the `java.io` package. 
The two most commonly used classes for reading and writing files are `FileInputStream` 
and `FileOutputStream`, respectively. These classes allow you to read and write data 
to binary files, but you can also use other classes like `BufferedReader` and `PrintWriter`
to read and write text files.

Reading from Files:
To read data from a file, you need to create an instance of the `FileInputStream` class
and use it to read the contents of the file. Here is an example:

```java
import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
            input.close();
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
}
```

In the above example, we use a `FileInputStream` to read the contents of a file called
"input.txt". We read the contents of the file one byte at a time using the `read()` method,
and we use a `while` loop to print out each byte as a character until the end of the file is
reached. Finally, we close the input stream using the `close()` method.

Writing to Files:
To write data to a file, you need to create an instance of the `FileOutputStream` class 
and use it to write the data to the file. Here is an example:

```java
import java.io.*;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("output.txt");
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            output.write(bytes);
            output.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException ex) {
            System.out.println("Error writing file: " + ex.getMessage());
        }
    }
}
```

In the above example, we use a `FileOutputStream` to write the string "Hello, World!" to a file
called "output.txt". We first convert the string to a byte array using the `getBytes()` 
method, and we use the `write()` method of the output stream to write the bytes to the file.
Finally, we close the output stream using the `close()` method.
