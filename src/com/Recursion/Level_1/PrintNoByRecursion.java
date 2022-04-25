package com.Recursion.Level_1;

public class PrintNoByRecursion {

    public static void main(String[] args) {
        nTo1(5);
    }

    public static void nTo1(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        nTo1(n-1);

    }
}
