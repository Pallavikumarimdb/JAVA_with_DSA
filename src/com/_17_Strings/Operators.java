package com._17_Strings;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Pallavi" + new ArrayList<>());
        System.out.println("Pallavi" + new Integer(56));
        // '+' operators only works for primitives.
        // operator overloading(can act in diff way than actual) only works for '+' in only one case.
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');
    }
}
