package com._18_Pattern;

// QUESTION
//        *
//       **
//      ***
//     ****
//    *****
public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int sp = 0; sp < n-row; sp++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
