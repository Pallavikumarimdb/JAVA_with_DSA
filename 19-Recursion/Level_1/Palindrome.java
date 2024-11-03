package com.Recursion.Level_1;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(checkPalindrome(12321));
    }

    public static int reverseNo(int n){

        int digit=(int)Math.log10(n)+1;
        return helper(n, digit);
    }

    public static int helper(int n, int digit){

        if(n%10==n){
            return n;
        }
        int rem=(n%10);

        return rem*((int) Math.pow(10, digit-1))+helper(n/10, digit-1);

    }

    public static boolean checkPalindrome(int num){
        return (num==reverseNo(num));
    }


}
