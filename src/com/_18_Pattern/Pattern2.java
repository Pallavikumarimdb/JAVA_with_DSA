package com._18_Pattern;

// QUESTION
//* * * *
//* * * *
//* * * *
//* * * *

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            // for every row, run the col
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");

            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
    }

}
