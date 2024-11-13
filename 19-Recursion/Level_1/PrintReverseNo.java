//package com.Recursion.Level_1;

public class PrintReverseNo {

    public static void main(String[] args) {
        OneToN(5);
    }

    public static void OneToN(int n){

        if(n==0){
            return;
        }
        OneToN(n-1);
        System.out.println(n);
    }

}
