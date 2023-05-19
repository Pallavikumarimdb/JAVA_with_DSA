package com.Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Pallavi";
        String b = "Pallavi";

        /*  Comparison of strings 
            1. "==" method :- Check if reference variables are pointing to same object
            2. ".equals()" method :- when we only need check/compare the value 
        */
        System.out.println(a==b);  // true
        System.out.println(a.equals(b)); // true

        // How to create diff objects of same value without caring of any optimization?
        String c=new String("Pallavi");
        String d=new String("Pallavi");
        // Creating these value outside the pool but in heap.
        System.out.println(c==d);  //false
        System.out.println(c.equals(d)); // true

    }
}
