package com._18_Pattern;

// QUESTIONS
//*
//**
//***
//****
//*****
//****
//***
//**
//*

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <2*n; row++) {
            int c;
//      row   col
//*      1     1
//**     2     2
//***    3     3
//****   4 eql 4     // till here we can do the same as Pattern1 question but after this step the method is different hence we need to write if else condition
//***    5     3     // From here the value of row is greater than n and here onward we are reducing one "*" at every step compare to above.
//**     6     2     // Hence we need formula to print "*" at every place. After calculating formula will be "n-[row-n] or 2n-row]".
//*      7     1

            if(row>n){
                c = 2*n-row;
            }else {
                c=row;
            }
            for (int col = 1; col <=c; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
