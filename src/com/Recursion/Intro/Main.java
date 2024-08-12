package com.Recursion.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];

        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(retInd(arr));
    }

    public static int retInd(int[] arr){
        Arrays.sort(arr);
        int count=1;
        for (int i = 1; i < arr.length-1; i++) {

            if(arr[i-1]==arr[i]-1){
                count++;
            }
        }
        return count;
    }
}
