package com.Strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) {

        // Everything will print as string because of internal java function
        System.out.println(56);
        // Here we can't access any predefined functions by java like (56.(functions())) so we can use wrapper class.

        // WRAPPER CLASS
        // Why use wrapper class ?? --- If we want to use all OOPs principles with integer values(primitives) which is stored in stack memory because it is primitive,
        //                              and it does not have classes hence we need to use wrapper classes.
        // We can only use OOPs principles with Obj & classes
        Integer num =new Integer(56);
        System.out.println(num.toString());
        System.out.println(num); // We can simply do this also



        System.out.println("Pallavi");



        int[] arr={1,2,3,4,5};
        // It will print random number because it is accessing simple toString() method which don't know about object printing
        System.out.println(arr.toString());

        //Now below we will use Arrays toSring() method which is designed for array printing (Pretty Printing) in java
        // Here Arrays toString function override simple toString (Function Overriding)
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));




        String n="null";
        System.out.println(n); // Print null
        // Here if we will try to use .toString method or any other method with null like (null.toString) then we will get NullPointerException.
//        NullPointerException is thrown when program attempts to use an object reference that has the null value.
//        It is raised in an application when we are trying to do some operation on null where an object is required.
//        Some common reasons for NullPointerException in java programs are: Invoking a method on an object instance but at runtime the object is null.

    }
}
