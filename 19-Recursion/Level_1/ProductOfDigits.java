package com.Recursion.Level_1;

public class ProductOfDigits {

    public static void main(String[] args) {
        System.out.println(digitProd(505));
    }

    public static int digitProd(int num){

        if(num%10==num){
            return num;
        }

        return (num%10)*digitProd(num/10);

    }


}
