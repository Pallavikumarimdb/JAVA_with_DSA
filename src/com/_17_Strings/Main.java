package com._17_Strings;

public class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 15, 50};
        int num = 10;

        //Here reference variable "name" of type String giving value of "Pallavi" is a collection of characters 
        String name = "Pallavi";
        System.out.println(name);

        /*
         Concept:
         ** We store objects in heap memory and reference variable or primitives in stack memory
         1. String Pool (we create inside heap memory to store objects for optimization purpose)
         2. Immutability (for security purpose)
         */
        

        // Here a and b are pointing to one object only called "Pallavi" inside the pool of Heap memory
        String a = "Pallavi";
        String b = "Pallavi";

        // We can't modify String object, so how to change object?
        String c="Pallavi";
        System.out.println(c);
        c = "Kumari";
        System.out.println(c);
        // Here we are not changing/modifiying the object "Pallavi", instead creating new object 
        // called "Kumari" and pointing c to new obj;
    }
}