package com.Recursion.Level_1;

public class ReverseTheNumber {
    public static void main(String[] args) {
//        reverseNum(2345);
//        System.out.println(sum);
        System.out.println(reverseNum(2345));
    }

//================================== SOLUTION 1 =============================================

    public static int reverseNum(int n){

        int digit = (int)(Math.log10(n))+1;
        return helper(n, digit);

    }

    public static int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem* (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }

//================================== SOLUTION 2 =============================================

//    static int sum=0;
//    public static void reverseNum(int n){
//        if(n==0){
//            return;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        reverseNum(n/10);
//
//    }

}
