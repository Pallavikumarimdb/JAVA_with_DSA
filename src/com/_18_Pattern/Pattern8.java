package com._18_Pattern;

//         QUESTION
//            *
//           ***
//          *****
//         *******
//        *********

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row <n; row++) {
            for (int i = 1; i <=n-row; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row*2; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
