package com._18_Pattern;
// QUESTION
//        *****
//         ****
//          ***
//           **
//            *

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = n; row >=0; row--) {
            for (int i = 0; i <n-row; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

