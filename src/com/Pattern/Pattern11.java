package com.Pattern;

// QUESTION
//       * * * * *
//        * * * *
//         * * *
//          * *
//           *

public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = n; row>=0; row--) {
            for (int i = 0; i < n-row; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
