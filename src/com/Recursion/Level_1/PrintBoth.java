package com.Recursion.Level_1;

public class PrintBoth {

    public static void main(String[] args) {
        OneToNandNToOne(5);
    }

    public static void OneToNandNToOne(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        OneToNandNToOne(n-1);
        System.out.println(n);
    }
}
