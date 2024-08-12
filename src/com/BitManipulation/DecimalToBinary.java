package com.BitManipulation;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ch="";
        while(n>0){
            int rem = n % 2;
            ch = rem+ch;
            n=n/2;
        }
        System.out.println(ch);
    }
}
