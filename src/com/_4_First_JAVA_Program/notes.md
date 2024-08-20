<h1 align="center"> *FIRST JAVA PROGRAM* </h1>

> Everything in java is inside class. <br/>
Every file that ends with .java is a class itself. <br/>
> Whatever variable we see in programming languages if it starts with capital letter means that is class. <br/>
> If the file name is for ex-Main.java the Main class will be "public" class. <br/>
> After successfully compilation of .java file will get a .class file and not directly it converted to machine code. That .class file is machine independent. <br/>
> main Function is the entry point of the java programme. <br/>
> Since java programme can't run without main fn, it's make obvious to make it public. If main fn won't run then programme will not run. <br/>
### Why main fn is static? <br/>
> Ans: Because, even without creating an object the object of given class we can execute main function. Because main fn execute first.
<br/>
### Commands
>javac -d . Main.java --- Create .class file in same directory. <br/>
>javac -d .. Main.java --- Create .class file in previous directory. <br/>
> where javac  --- gives the location of javac executable file.(Where file is located) <br/>
> 

> Scanner class in Java is found in the java.util package. Java provides various ways to read input from the keyboard, the java.util.Scanner class is one of them. <br/>
> To get the instance of Java Scanner which reads input from the user, we need to pass the input stream (System.in) in the constructor of Scanner class.
> (System.in) --- input from keyboard
> 
> 
## Structure of Java File
#### “Source code that we write will be saved using extension .java”
>  Every thing written in .java file must be in classes or we can say that
every file having .java extension is a class <br/>
>  A class with same name as file name must be present in .java file. <br/>
#### First alphabet of class name can be in upper case. It is the naming convention of class name. however, it is not compulsory to do so. <br/>
>  Class which is having same name as file must be public class <br/>
>  A main function/method must be present in this public class, main is a function from where the program starts. <br/>

## Converting .java to .class
>  Using javac compiler we can convert .java file to .class <br/>
#### Command to convert .java to .class 
##### Javac and .java file name <br/>
> Let the name of .java file is Main, so the command to convert .java to .class is <br/>
##### Javac Main.java <br/>
> Above command create a . class file (Main.class) which contains Bytecode. <br/>


## Running the program
> By using java and name of file we can run the program.
>  Command > java Main


## Hello world program
```java
public class Main{ 
    public static void main(String [] args){
        System.out.println("Hello World");
    }
}
```

> 1. public (in first line):- public is an access modifier which allows to access
   the class from anywhere. <br/>
> 2. class :- It is a name group of properties and functions <br/>
> 3. Main :- It is just the name of class as same as the name of file.<br/>
> 4. public (in second line) :- It is used to allow the program to use main
   function from anywhere.<br/>
> 5. static :- It is a keyword which helps the main method to run without
   using objects.<br/>
> 6. void :- It is a keyword used when we do not want to return anything
   from a method/function<br/>
> 7. main :-It is the name of method.<br/>
> 8. String [] args :- It is a command line argument of string type array.<br/>
> 9. System:- It is a final class defined in java.lang package.<br/>
> 10. out :- It is a variable of PrintStream type which is public and static
    member field of the System class.<br/>
> 11. println :- It is a method of PrintStream class, It prints the argumants
    passed to it and adds a new line. print can aalso be used here but it
    prints only arguments passed to it. It do not adds a new line.<br/>


## What is package ?
> → It is just a folder in which java files lies.<br/>
> → It is used to provide some rules and stuff to our programs.<br/>


## Primitive data types
>  Primitives data types are those data types which is not breakable.<br/>
Ex:-<br/>
> String is not a primitive data type so we can break this data type into char<br/>
i.e., String “Kunal” can be divided into<br/>
‘K’ ‘u’ ‘n’ ‘a’ ‘l’<br/>
But primitives data type are not breakable.<br/>
We cannot break a char ,int etc.<br/>
###  List of primitive data types in java are :- <br/>
#### Data types Description Example 
>int ------- int is used to store numeric digits ------- int i = 26; <br/>
char ------- char is used to store character ------- char c = ‘A’; <br/>
float ------- flot is used to store floating point numbers ------- float f = 98.67f; <br/>
double ------- double is used to store larger decimal numbers ------- double d = 45676.58975 ; <br/>
long ------- long is used to store numeric digits which is not able to stored in int ------- long l = 15876954832558315l; <br/>
boolean ------- It only stores store t values i.e., true or false. ------- boolean b = false; <br/>

> In float and long we have used f and l, it denotes that the number in the
variable is float or long type, if we do not use this java consider float value as
double and long value as int. <br/>
>  Literals :- It is a synthetic representation of boolean, character, string,
and numeric data. <br/>
Ex:- int a = 10; <br/>v
Here 10 is called literal. <br/>
>  Identifiers:- name of variable, methods, class, packages, etc. are known as identifiers. <br/>
Ex:- int a = 10; <br/>
Here a is Identifier <br/>


## Comments in Java
>Comments are something which is written in source code but ignored by
compiler.
###  Two types of Comment
> 1. Single line comment :- used to comment down a single line. <br/>
   (// is used for it.) <br/>
> 2. Multi line comment :- used to comment down multiple lines. <br/>
   (/* */ is used for it) <br/>
## Inputs in Java
>We have Scanner class available in java.util package to take input
   To use this class we have to
> 1. Import java.util package in our file. <br/>
> 2. Create object of the scanner class. <br/>
> 3. Use that object to take input from the keyboard. <br/>

## Syntax :-
```java
import java.util.Scanner;
public class Main{ 
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
    }
}
```

>1. Scanner :- It is a class required to take input, it is present in java.util
    package.
>2. input :- It is an object that we are creating to take input.
>3. new :- It is a keyword used to create an object in java.
>4. System.in :- System is a class and in is a variable that denotes we are
   taking input from standard input stream (i.e. Keyboard).