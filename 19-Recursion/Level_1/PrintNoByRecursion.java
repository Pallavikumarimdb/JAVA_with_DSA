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


    public static void anoConc(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        // Here "n" will first decrement then pass to the function
        anoConc(--n);

        //If you want to write cnoConc(n--) it will go for infinite loop because every time "n" will first pass the value then
        // decrement and never decrease value from n
        // anoConc(n--) ❌


    }
}
