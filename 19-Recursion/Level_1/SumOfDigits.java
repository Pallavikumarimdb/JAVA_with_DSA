package com.Recursion.Level_1;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitSum(123456));
    }

    public static int digitSum(int num){

        if(num==0){
            return 0;
        }

        int sum=0;
        sum = num%10;
        return sum+digitSum(num/10);

    }

}
