package com.Pattern;

// Question
//       *********
//        *******
//         *****
//          ***
//           *

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = n; row >=0; row--) {
            for (int j = 0; j <=n-row; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row*2; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
