package com._18_Pattern;

// HOW TO APPROACH THE PROBLEMS
// EXAMPLE QUESTION
//*
//* *
//* * *
//* * * *

//Here we have 4 Rows,
//1st row - 1 column
//2nd row - 2 column
//3rd row - 3 column
//4th row - 4 column
//here we can see no of column is particular row no.

//STEPS TO SOLVE PROBLEMS
//1. No.of lines = no of rows = no. of times outer loop will run
//2. Identify for every row no.,
//   * How many column are there
//   * Type of element in column
//3. What do you need to print
//4. Try to find the formula relating rows and column

public class Pattern1 {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        for (int row = 1; row <= n ; row++) {
            // for every row, run the col
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
    }
}






























