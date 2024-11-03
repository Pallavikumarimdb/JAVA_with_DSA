package com._18_Pattern;

// QUESTION
//*****
//****
//***
//**
//*

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
        System.out.println("Method 2");
        pattern(5);
    }
    static void pattern3(int n){
        for (int row = 0; row < n ; row++) {
            // for every row, run the col
            for (int col = 1; col <=n-row; col++) {
                System.out.print("*");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
    }

    // METHOD 2
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            // for every row, run the col
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
